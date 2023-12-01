package javaPOO.exerc09;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Produto' com atributos como nome, preço e quantidade em estoque. Adicione métodos para realizar compras e exibir informações sobre o produto. ");

        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        produto1.exibirInformacoes();

        produto1.realizarCompra(20);
        produto1.exibirInformacoes();

        produto1.adicionarEstoque(30);
        produto1.exibirInformacoes();

        produto1.realizarCompra(60);
    }
}

