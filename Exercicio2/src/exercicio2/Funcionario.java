
package exercicio2;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        setSalario(salario);
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário não pode ser negativo!");
            this.salario = 0;
        }
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }


    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}

