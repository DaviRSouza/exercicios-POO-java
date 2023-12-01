package javaPOO.exerc03;

public class Main {

    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada 'Livro' com atributos como título, autor e número de páginas. Adicione métodos para exibir informações sobre o livro. ");

        Livro liv = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, 1954);
        liv.mostrarInformacoes();
    }
}
