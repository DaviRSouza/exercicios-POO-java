package javaPOO.exerc06;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Triangulo' com atributos para os lados. Adicione métodos para calcular a área e verificar se é um triângulo equilátero, isósceles ou escaleno. ");

        Triangulo equilatero = new Triangulo(5, 5, 5);
        Triangulo isosceles = new Triangulo(4, 4, 3);
        Triangulo escaleno = new Triangulo(7, 4, 9);
        Triangulo invalido = new Triangulo(1, 1, 3);

        System.out.println("Área do Equilátero: " + equilatero.calcularArea());
        System.out.println("Tipo de Equilátero: " + equilatero.verificarTipoTriangulo());

        System.out.println("Área do Isósceles: " + isosceles.calcularArea());
        System.out.println("Tipo de Isósceles: " + isosceles.verificarTipoTriangulo());

        System.out.println("Área do Escaleno: " + escaleno.calcularArea());
        System.out.println("Tipo de Escaleno: " + escaleno.verificarTipoTriangulo());

        System.out.println("Área do Inválido: " + invalido.calcularArea());
        System.out.println("Tipo de Inválido: " + invalido.verificarTipoTriangulo());
    }
}

