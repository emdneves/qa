import org.PL01_01.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        assertEquals(16, calculator.subtract(-8, -8), "negativo com negativo");
        assertEquals(16, calculator.subtract(24, -8), "negativo com negativo");
        assertEquals(24, calculator.subtract(24, -0), "negativo com negativo");
        assertEquals(16, calculator.subtract(24, -0), "negativo com negativo");

    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(10, 2);
        assertEquals(20, result);
    }
    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}