
package exercicio3;

public class ContaCorrente {

    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }


    public double consultarSaldo() {
        return saldo;
    }


    public void exibirDados() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

