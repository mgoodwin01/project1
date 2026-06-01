import static org.junit.Assert.assertEquals;
import org.junit.Test;

// This class contains JUnit tests for the AverageCalculator class.
public class AverageCalculatorTest {

    @Test
    public void testAverageOfPositiveNumbers() {
        AverageCalculator calc = new AverageCalculator();

        // Test data
        double[] values = {10, 20, 30};

        // Assert that the average is correct
        assertEquals(20.0, calc.calculateAverage(values), 0.0001);
    }

    @Test
    public void testAverageOfMixedNumbers() {
        AverageCalculator calc = new AverageCalculator();

        double[] values = {-5, 5, 15};

        // Expected average = ( -5 + 5 + 15 ) / 3 = 5
        assertEquals(5.0, calc.calculateAverage(values), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayThrowsException() {
        AverageCalculator calc = new AverageCalculator();

        // Passing an empty array should trigger the exception
        calc.calculateAverage(new double[]{});
    }
}
