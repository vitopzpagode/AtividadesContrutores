
package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
          Funcionario funcionario1 = new Funcionario("Vitor", 3000, "Desenvolvedor");

        System.out.println("Dados antes do aumento:");
        funcionario1.exibirDados();

        funcionario1.aumentarSalario(10);

        System.out.println("\nApós aumento de salário:");
        funcionario1.exibirDados();

    }
}
