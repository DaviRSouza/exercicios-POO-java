package javaPOO.exerc09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void realizarCompra(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para compra.");
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Quantidade insuficiente em estoque para a compra de " + quantidade + " unidades.");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Compra realizada com sucesso: " + quantidade + " unidades de " + nome);
        }
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para adição ao estoque.");
        } else {
            quantidadeEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " unidades ao estoque de " + nome);
        }
    }
    public void exibirInformacoes() {
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque + " unidades");
    }
}

