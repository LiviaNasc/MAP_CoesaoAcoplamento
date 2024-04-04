import exceptions.ExceptionValorNegativoOuZero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCirculo {
    private Circulo circulo;

    @Before
    public void setUp() throws Exception {
        try {
            circulo = new Circulo(4);
        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }

    }

    @Test
    public void testCalcArea() {
        assertEquals(50.265, circulo.calcArea(), 0.001);
    }

    @Test
    public void testCalcPerimetro() {
        assertEquals(25.133, circulo.calcPerimetro(), 0.001);
    }

    @Test(expected = ExceptionValorNegativoOuZero.class)
    public void testRaioNegativo() throws ExceptionValorNegativoOuZero {
        new Circulo(-4);
    }
}

