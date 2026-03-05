
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1234, "Vitor");

        conta.exibirDados();

        System.out.println("\nDepositando 500...");
        conta.depositar(500);

        System.out.println("Saldo atual: " + conta.consultarSaldo());

        System.out.println("\nSacando 200...");
        conta.sacar(200);

        System.out.println("Saldo atual: " + conta.consultarSaldo());

        System.out.println("\nTentando sacar 400...");
        conta.sacar(400);

        System.out.println("Saldo final: " + conta.consultarSaldo());
    }
}
