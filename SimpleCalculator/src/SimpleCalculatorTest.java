import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SimpleCalculatorTest {
    @Test
    void twoPlusTwoequalFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
        assertNotEquals(7, calculator.add(9, 6));
    }

    @Test
    void fiveTimesFiveIs25() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    void fourMinusFourIsZero() {
        var calculator = new SimpleCalculator();
        assertEquals(0, calculator.subtract(4, 4));
    }

    @Test
    void fourty9Dividedby7is7() {
        var calculator = new SimpleCalculator();
        assertEquals(7, calculator.divide(49, 7));
    }

}