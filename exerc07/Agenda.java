package javaPOO.exerc07;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<String> contatos;
    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    public void adicionarContato(String nomeContato) {
        contatos.add(nomeContato);
        System.out.println("Contato '" + nomeContato + "' adicionado à agenda.");
    }
    public void removerContato(String nomeContato) {
        if (contatos.contains(nomeContato)) {
            contatos.remove(nomeContato);
            System.out.println("Contato '" + nomeContato + "' removido da agenda.");
        } else {
            System.out.println("Contato '" + nomeContato + "' não encontrado na agenda.");
        }
    }
    public void exibirContatos() {
        System.out.println("Contatos na agenda:");
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
