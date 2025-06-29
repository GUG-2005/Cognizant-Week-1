import org.junit.Test;
import static org.junit.Assert.*;

public class DemoCalculatorTest {
    @Test
    public void testAdd() {
        DemoCalculator calc = new DemoCalculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
}
