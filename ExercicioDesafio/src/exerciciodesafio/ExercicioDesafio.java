
package exerciciodesafio;

public class ExercicioDesafio {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vitor", 20);
        Pessoa p2 = new Pessoa("Felipe", 30);
        Pessoa p3 = new Pessoa("Murilo", 25);

        // Alterar dados via setters
        p1.setNome("Vitor");
        p2.setIdade(31);
        p3.setNome("Murilo");

        p1.fazerAniversario();
        p2.fazerAniversario();
        p3.fazerAniversario();

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
