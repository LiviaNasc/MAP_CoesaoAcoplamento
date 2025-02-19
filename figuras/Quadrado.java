import exceptions.ExceptionValorNegativoOuZero;

public class Quadrado implements FigurasGeometricas {
    private double lado;

    public Quadrado(double lado) throws ExceptionValorNegativoOuZero {
        if (lado <= 0) throw new ExceptionValorNegativoOuZero();
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado * lado;
    }

    @Override
    public double calcPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "O quadrado criado tem lados de tamanho: " + this.lado;
    }
}
