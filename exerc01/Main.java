package javaPOO.exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada 'Ponto' com atributos 'x' e 'y' (coordenadas) e métodos para definir e exibir esses valores. ");
        Ponto point = new Ponto();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da cordenada X: ");
        double x = sc.nextDouble();
        point.setX(x);

        System.out.print("Informe o valor da cordenada Y: ");
        double y = sc.nextDouble();
        point.setY(y);

        point.mostrarCordenadas();
    }
}
