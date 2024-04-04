import exceptions.ExceptionValorNegativoOuZero;

public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {
        try {
            FigurasGeometricas circulo = new Circulo(4);
            FigurasGeometricas quadrado = new Quadrado(4);
            FigurasGeometricas retangulo = new Retangulo(4, 6);


            System.out.println("Perímetro das figuras geométricas: \n");
            System.out.printf("Perímetro do círculo: %.2f\n", circulo.calcPerimetro());
            System.out.printf("Perímetro do quadrado: %.2f\n", quadrado.calcPerimetro());
            System.out.printf("Perímetro do retângulo: %.2f\n", retangulo.calcPerimetro());

            System.out.println("\nÁrea das figuras geométricas: \n");
            System.out.printf("Área do círculo: %.2f\n", circulo.calcArea());
            System.out.printf("Área do quadrado: %.2f\n", quadrado.calcArea());
            System.out.printf("Área do retângulo: %.2f\n", retangulo.calcArea());

            System.out.println("\ntoString das figuras geométricas: \n");
            System.out.println(circulo.toString());
            System.out.println(quadrado.toString());
            System.out.println(retangulo.toString());

        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }

    }
}