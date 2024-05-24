import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente minhaContaCorrente = new ContaCorrente("José de Almeida");
        ContaPoupanca minhaPoupanca = new ContaPoupanca("José de Almeida");
        minhaContaCorrente.imprimirExtrato();
        System.out.println("-------------------------");
        minhaPoupanca.imprimirExtrato();
        System.out.println("-------------------------");
        minhaContaCorrente.depositar(2000.99);
        minhaContaCorrente.transferir(550.99, minhaPoupanca);
        minhaContaCorrente.imprimirExtrato();
        minhaPoupanca.depositar(1000);
        System.out.println("-------------------------");
        minhaPoupanca.imprimirExtrato();
        System.out.println("-------------------------");
        minhaPoupanca.sacar(5000);
        minhaContaCorrente.sacar(2000);
        System.out.println("-------------------------");
        minhaContaCorrente.imprimirExtrato();
        System.out.println("-------------------------");
        minhaPoupanca.imprimirExtrato();
    }
}