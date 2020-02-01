package main;

import math.ensayo;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    //x^2 + y^2 <= 1
    //4*(numero de aciertos/numero de ensayos)
    public static void main(String args[]) {

        String entrada = new String();

        do
            {
                begin_test();
                System.out.println("¿Repetir el experimento?\n1 .- Si\n2 .- No");
                Scanner entradaEscaner = new Scanner(System.in);
                entrada = entradaEscaner.nextLine();
            }while(entrada.equals("1"));
    }

    public static void begin_test() {
        ensayo obj_ensayo = new ensayo();
        String entrada = new String();
        double contador_aciertos = 0.0;
        double contador_ensayos = 0.0;

        System.out.println("Dame el número de repeticiones");
        Scanner entradaEscaner = new Scanner(System.in);
        entrada = entradaEscaner.nextLine();

        boolean[] ensayos = new boolean[Integer.parseInt(entrada)];

        for (int i = 0; i < Integer.parseInt(entrada); i++) {
            ensayos[i] = obj_ensayo.iniciar_ensayo();
            contador_ensayos = contador_ensayos + 1.0;
            if (ensayos[i]) {
                contador_aciertos = contador_aciertos + 1.0;
            }
        }

        System.out.println("contador de ensayos: " + contador_ensayos);
        System.out.println("contador de aciertos: " + contador_aciertos);

        double fraccion = (double) (contador_aciertos / contador_ensayos);
        System.out.println("fraccion = " + fraccion);

        System.out.println("La aproximación de pi es: " + (double) 4 * (double) (contador_aciertos / contador_ensayos));
    }
}
