package javaPOO.exerc06;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean validarTriangulo() {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    public double calcularArea() {
        if (validarTriangulo()) {
            double semiPerimetro = calcularPerimetro() / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        } else {
            System.out.println("Não é um triângulo válido. Área não pode ser calculada.");
            return -1;
        }
    }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public String verificarTipoTriangulo() {
        if (validarTriangulo()) {
            if (ladoA == ladoB && ladoB == ladoC) {
                return "Equilátero";
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        } else {
            return "Triângulo inválido";
        }
    }
}

