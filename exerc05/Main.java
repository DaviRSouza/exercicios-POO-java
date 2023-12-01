package javaPOO.exerc05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Carro' com atributos como modelo, ano e cor. Adicione métodos para ligar, desligar e exibir informações sobre o carro. ");

        Carro meuCarro = new Carro("Fusca", 1975, "Azul");
        meuCarro.exibirInfoDetalhada();
        meuCarro.ligar();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.exibirInfoDetalhada();
        meuCarro.desligar();
    }
}

