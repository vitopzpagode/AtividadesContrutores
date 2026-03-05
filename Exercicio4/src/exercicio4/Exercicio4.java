
package exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
          Produto p1 = new Produto("Notebook", 3500);
        Produto p2 = new Produto("Mouse", 50);

        p1.entradaEstoque(10);
        p2.entradaEstoque(20);

        p1.saidaEstoque(3);
        p2.saidaEstoque(5);

        System.out.println("Valor total em estoque do produto 1: " + p1.valorTotalEstoque());
        System.out.println("Valor total em estoque do produto 2: " + p2.valorTotalEstoque());
    }
}
    
    

