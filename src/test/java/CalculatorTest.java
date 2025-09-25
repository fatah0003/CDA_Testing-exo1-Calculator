// CalculatorTest.java

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, calculator.sub(3, 2));
    }

    @Test
    void testMul() {
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    void testDiv() {
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    void testDivByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }
}
