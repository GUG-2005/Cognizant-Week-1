import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTestAAA {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down...");
        calculator = null;
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }

    @Test
    public void testAdditionWithZero() {
        int a = 0;
        int b = 10;
        int result = calculator.add(a, b);
        assertEquals(10, result);
    }
}
