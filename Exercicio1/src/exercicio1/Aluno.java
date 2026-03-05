
package exercicio1;


public class Aluno {
    

    private String nome;
    private double nota1;
    private double nota2;


    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        setNota1(nota1);
        setNota2(nota2);
    }


    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota1 inválida! Deve ser entre 0 e 10.");
            this.nota1 = 0;
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota2 inválida! Deve ser entre 0 e 10.");
            this.nota2 = 0;
        }
    }


    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }


    public boolean verificarAprovacao() {
        return calcularMedia() >= 6;
    }


    public String getNome() {
        return nome;
    }
}

