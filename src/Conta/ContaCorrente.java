package Conta;

import Cliente.Cliente;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1000;

    private double limite;

    public ContaCorrente(String nomeTitular) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        this.limite = 1000.0;
        super.titular = new Cliente(nomeTitular);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            double valorAMais = valor - this.saldo;
            if(this.limite >= valorAMais) {
                this.saldo = 0;
                this.limite -= valorAMais;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente");
        System.out.println(String.format("Titular: %s", this.getTitular().getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
        System.out.println(String.format("Limite: %.2f", this.getLimite()));
    }

}
