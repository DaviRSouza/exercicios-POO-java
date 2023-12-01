package javaPOO.exerc08;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Aluno' com atributos como nome, matrícula e notas. Adicione métodos para calcular a média das notas. ");

        Aluno aluno1 = new Aluno("Maria", "2021001");
        aluno1.adicionarNota(7.5);
        aluno1.adicionarNota(8.0);
        aluno1.adicionarNota(6.0);

        double mediaAluno1 = aluno1.calcularMedia();
        System.out.println("Média das notas do aluno " + aluno1.getNome() + ": " + mediaAluno1);

        aluno1.adicionarNota(9.0);
        aluno1.adicionarNota(7.0);

        double novaMediaAluno1 = aluno1.calcularMedia();
        System.out.println("Nova média das notas do aluno " + aluno1.getNome() + ": " + novaMediaAluno1);
    }
}

