package javaPOO.exerc10;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    // Método para contratar um funcionário
    public void contratarFuncionario(Funcionario novoFuncionario) {
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário contratado: " + novoFuncionario.getNome());
    }

    // Método para demitir um funcionário
    public void demitirFuncionario(String nomeFuncionario) {
        Funcionario funcionarioDemitido = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nomeFuncionario)) {
                funcionarioDemitido = funcionario;
                break;
            }
        }

        if (funcionarioDemitido != null) {
            funcionarios.remove(funcionarioDemitido);
            System.out.println("Funcionário demitido: " + nomeFuncionario);
        } else {
            System.out.println("Funcionário não encontrado na empresa.");
        }
    }

    // Método para exibir informações sobre os funcionários da empresa
    public void exibirFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.toString());
            }
        }
    }

    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

