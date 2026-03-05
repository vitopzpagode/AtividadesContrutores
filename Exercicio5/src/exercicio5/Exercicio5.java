
package exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
         Retangulo r1 = new Retangulo(5, 5);
        Retangulo r2 = new Retangulo(4, 7);

        System.out.println("Área r1: " + r1.calcularArea());
        System.out.println("Perímetro r1: " + r1.calcularPerimetro());
        System.out.println("r1 é quadrado? " + r1.ehQuadrado());

        System.out.println();

        System.out.println("Área r2: " + r2.calcularArea());
        System.out.println("Perímetro r2: " + r2.calcularPerimetro());
        System.out.println("r2 é quadrado? " + r2.ehQuadrado());
    }
}
