package Conta;

import Cliente.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    private double aliquotaRendimento;

    public ContaPoupanca(String nomeTitular) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        this.aliquotaRendimento = 2.3;
        super.titular = new Cliente(nomeTitular);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + (valor + ((valor * this.aliquotaRendimento)/100));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança");
        System.out.println(String.format("Titular: %s", this.getTitular().getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
        System.out.println(String.format("Alíquota rendimento: %.2f", this.getAliquotaRendimento()));
    }
}
