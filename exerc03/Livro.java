package javaPOO.exerc03;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int ano;

    public Livro(String titulo, String autor, int numeroPaginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.ano = ano;
    }
    public void mostrarInformacoes() {
        System.out.println("Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Ano do livro: " + ano);
    }
}
