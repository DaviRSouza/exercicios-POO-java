package javaPOO.exerc01;

public class Ponto {
    private double x;
    private double y;

    /*
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    */

    public void setX(double setX) {
        this.x = setX;
    }
    public void setY(double setY) {
        this.y = setY;
    }

    public void mostrarCordenadas(){
        System.out.println("As são Coordenadas: (" + x + ", " + y + ")");
    }
}
