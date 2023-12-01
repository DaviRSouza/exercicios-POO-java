package javaPOO.exerc05;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;
    private int velocidade;
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
        this.velocidade = 0;
    }
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("O carro acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }
    public void frear(int reducao) {
        if (ligado) {
            if (velocidade >= reducao) {
                velocidade -= reducao;
                System.out.println("O carro reduziu a velocidade para " + velocidade + " km/h.");
            } else {
                velocidade = 0;
                System.out.println("O carro parou completamente.");
            }
        } else {
            System.out.println("Não é possível frear. O carro está desligado.");
        }
    }
    public void exibirInfoDetalhada() {
        System.out.println("Informações do carro:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (ligado ? "ligado" : "desligado"));
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}

