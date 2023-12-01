package javaPOO.exerc04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'ContaBancaria' com atributos como saldo e número da conta. Adicione métodos para depositar, sacar e exibir o saldo. ");

        ContaBancaria minhaConta = new ContaBancaria(1000, 12345);

        System.out.println("Saldo Inicial:");
        minhaConta.exibirSaldo();

        minhaConta.depositar(500);
        System.out.println("\nDepósito realizado:");
        minhaConta.exibirSaldo();

        try {
            minhaConta.sacar(200);
            System.out.println("\nSaque realizado:");
            minhaConta.exibirSaldo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            minhaConta.sacar(2000);
            System.out.println("\nSaque realizado:");
            minhaConta.exibirSaldo();
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao sacar: " + e.getMessage());
        }

        System.out.println("\nHistórico de Transações:");
        minhaConta.mostrarHistoricoTransacoes();

        minhaConta.setNumeroConta(54321);
        System.out.println("\nNúmero da conta modificado: " + minhaConta.getNumeroConta());
    }
}

