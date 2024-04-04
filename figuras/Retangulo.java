import exceptions.ExceptionValorNegativoOuZero;

public class Retangulo implements FigurasGeometricas {
    private double base;
    private double altura;

    public Retangulo(double altura, double base) throws ExceptionValorNegativoOuZero {
        if (altura <= 0 || base <= 0) throw new ExceptionValorNegativoOuZero();
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcArea() {
        return base * altura;
    }

    @Override
    public double calcPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String toString() {
        return "O retângulo criado tem altura de tamanho: " + this.altura + " e largura de tamanho: " + this.base;
    }
}