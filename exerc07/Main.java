package javaPOO.exerc07;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Agenda' para armazenar contatos. Adicione métodos para adicionar, remover e exibir contatos. ");

        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("João");
        minhaAgenda.adicionarContato("Maria");
        minhaAgenda.adicionarContato("Carlos");

        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Maria");

        minhaAgenda.exibirContatos();
    }
}

