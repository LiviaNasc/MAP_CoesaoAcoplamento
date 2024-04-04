import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import exceptions.ExceptionValorNegativoOuZero;


public class TestRetangulo {
    private Retangulo retangulo;

    @Before
    public void setUp() throws Exception {
        retangulo = new Retangulo(4, 5);
    }

    @Test
    public void testCalcArea() {
        assertEquals(20, retangulo.calcArea(), 0.001);
    }

    @Test
    public void testCalcPerimetro() {
        assertEquals(18, retangulo.calcPerimetro(), 0.001);
    }

    @Test(expected = ExceptionValorNegativoOuZero.class)
    public void testBaseNegativa() throws ExceptionValorNegativoOuZero {
        new Retangulo(4, -5);
    }

    @Test(expected = ExceptionValorNegativoOuZero.class)
    public void testAlturaNegativa() throws ExceptionValorNegativoOuZero {
        new Retangulo(-4, 5);
    }
}
