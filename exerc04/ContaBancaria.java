package javaPOO.exerc04;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private double saldo;
    private int numeroConta;
    private List<String> historicoTransacoes;

    public ContaBancaria(double saldoInicial, int numeroConta) {
        this.saldo = saldoInicial;
        this.numeroConta = numeroConta;
        this.historicoTransacoes = new ArrayList<>();
        registrarTransacao("Conta criada com saldo inicial: " + saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao("Depósito de " + valor + " realizado com sucesso.");
        } else {
            throw new IllegalArgumentException("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            registrarTransacao("Saque de " + valor + " realizado com sucesso.");
        } else {
            throw new IllegalArgumentException("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void mostrarHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    private void registrarTransacao(String descricaoTransacao) {
        historicoTransacoes.add(descricaoTransacao);
    }
}

