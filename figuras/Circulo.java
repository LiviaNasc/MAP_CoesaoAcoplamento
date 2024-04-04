
import exceptions.ExceptionValorNegativoOuZero;

public class Circulo implements FigurasGeometricas{
    private double raio;

    public Circulo(double raio) throws ExceptionValorNegativoOuZero {
        if(raio <= 0) throw new ExceptionValorNegativoOuZero();
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) throws ExceptionValorNegativoOuZero {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + this.raio;
    }
}
