import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        double result = calculator.add(5, 4);
        assertEquals(9, result, 0.01);
    }
    @Test
    public void cansubtract() {
        double result = calculator.subtract(9, 4);
        assertEquals(5, result, 0.01);
    }

    @Test
    public void canmultiply() {
        double result = calculator.multiply(7,7);
        assertEquals(49, result, 0.01);
    }

    @Test
    public void candivide() {
        double result = calculator.divide(144,12);
        assertEquals(12, result, 0.01);
    }

}
