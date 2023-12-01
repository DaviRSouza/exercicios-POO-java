package javaPOO.exerc02;

public class Circulo {
    private Ponto centro;
    private double raio;

    // Construtor
    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para exibir as informações do círculo
    public void exibirInformacoes() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + centro.getX() + ", " + centro.getY() + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
