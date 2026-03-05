
package exercicio5;

public class Retangulo {
    
    private double largura;
    private double altura;

    
    public Retangulo(double largura, double altura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            this.largura = 0;
        }

        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 0;
        }
    }

    
    public double calcularArea() {
        return largura * altura;
    }

    
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    
    public boolean ehQuadrado() {
        return largura == altura;
    }
}

