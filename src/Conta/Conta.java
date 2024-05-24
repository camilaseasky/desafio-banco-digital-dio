package Conta;

import Cliente.Cliente;
import lombok.Data;

@Data
public class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;

    protected int numero;
    protected int agencia;
    protected Cliente titular;
    protected double saldo;
    protected Boolean ativa;

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente na conta!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}
