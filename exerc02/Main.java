package javaPOO.exerc02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada 'Círculo' que utilize a classe 'Ponto' para representar um círculo. Adicione métodos para calcular a área e o perímetro do círculo. ");
        Ponto centro = new Ponto(0,0);
        Circulo circulo = new Circulo(centro, 5);
        circulo.exibirInformacoes();
    }
}

