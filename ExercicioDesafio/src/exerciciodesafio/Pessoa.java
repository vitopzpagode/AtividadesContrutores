
package exerciciodesafio;

public class Pessoa {
      private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Nome inválido";
        }

        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println();
    }
}

