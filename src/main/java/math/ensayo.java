package math;

public class ensayo {

    //4*(numero de aciertos/numero de ensayos)

    private double cord_x;
    private double cord_y;
    private boolean inside_region_flag = Boolean.parseBoolean(null);

    public ensayo(){
        this.cord_x = 0.00000;
        this.cord_y = 0.00000;
    }

    public double crear_numero_aleatorio() {
        double randomNum = Math.random();
        System.out.println("El número generado es: " + randomNum);
        return randomNum;
    }

    public boolean iniciar_ensayo(){

        double test_x;
        double test_y;
        boolean cord_valida = false;
        boolean dentro_de_circulo = Boolean.parseBoolean(null);

        do{
            test_x = this.crear_numero_aleatorio();
            test_y = this.crear_numero_aleatorio();

            if(test_x + test_y <= 2){
                this.cord_x = test_x;
                this.cord_y = test_y;
                cord_valida = true;
            }

        }while(!cord_valida);

        if((Math.pow(test_x,2) + Math.pow(test_y,2)) <= 1){
            dentro_de_circulo = true;
            this.inside_region_flag = true;
        } else {
            dentro_de_circulo = false;
            this.inside_region_flag = false;
        }

        return dentro_de_circulo;
    }

    public double getCord_x() {
        return cord_x;
    }

    public void setCord_x(double cord_x) {
        this.cord_x = cord_x;
    }

    public double getCord_y() {
        return cord_y;
    }

    public void setCord_y(double cord_y) {
        this.cord_y = cord_y;
    }

    public boolean isInside_region_flag() {
        return inside_region_flag;
    }

    public void setInside_region_flag(boolean inside_region_flag) {
        this.inside_region_flag = inside_region_flag;
    }
}
