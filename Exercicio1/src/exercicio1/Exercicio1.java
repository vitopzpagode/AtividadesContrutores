
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
         
        Aluno aluno1 = new Aluno("Vitor", 7.5, 8.0);

        System.out.println("Aluno: " + aluno1.getNome());

        double media = aluno1.calcularMedia();
        System.out.println("Média: " + media);

        if (aluno1.verificarAprovacao()) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

    }
}