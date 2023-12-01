package javaPOO.exerc02;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void mostrarCordenadas(){
        System.out.println("As são Coordenadas: (" + x + ", " + y + ")");
    }
}
