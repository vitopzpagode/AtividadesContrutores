
package exercicio4;

public class Produto {
    
     private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }

        this.quantidade = 0;
    }

    public void entradaEstoque(int qtd) {
        quantidade += qtd;
    }

    public void saidaEstoque(int qtd) {
        quantidade -= qtd;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }
}

