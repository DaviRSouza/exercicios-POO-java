package javaPOO.exerc10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma classe 'Empresa' com atributos como nome, CNPJ e lista de funcionários. Adicione métodos para contratar, demitir e exibir informações sobre os funcionários. ");

        Empresa minhaEmpresa = new Empresa("Tutora.IA", "123456789");

        Funcionario funcionario1 = new Funcionario("João", 30, 3000);
        Funcionario funcionario2 = new Funcionario("Maria", 25, 2500);

        minhaEmpresa.contratarFuncionario(funcionario1);
        minhaEmpresa.contratarFuncionario(funcionario2);

        minhaEmpresa.exibirFuncionarios();

        minhaEmpresa.demitirFuncionario("João");

        minhaEmpresa.exibirFuncionarios();
    }
}

