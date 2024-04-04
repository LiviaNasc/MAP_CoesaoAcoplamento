import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import exceptions.ExceptionValorNegativoOuZero;

public class TestQuadrado {
    private Quadrado quadrado;

    @Before
    public void setUp() throws Exception {
        quadrado = new Quadrado(4);
    }

    @Test
    public void testCalcArea() {
        assertEquals(16, quadrado.calcArea(), 0.001);
    }

    @Test
    public void testCalcPerimetro() {
        assertEquals(16, quadrado.calcPerimetro(), 0.001);
    }

    @Test(expected = ExceptionValorNegativoOuZero.class)
    public void testLadoNegativo() throws ExceptionValorNegativoOuZero {
        new Quadrado(-4);
    }
}

