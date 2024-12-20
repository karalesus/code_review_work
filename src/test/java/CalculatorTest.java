import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(1, 4));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(3, 1));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(6, 2));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(5, 2));
    }

    @Test
    void solver() {
        int result = calculator.solver(2, 8, 6);
        assertEquals(-60, result);
    }
}