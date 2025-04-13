import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    @Test
    public void testNormalBMI() {
        double bmi = BMICalculator.calculateBMI(70, 1.75);
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    public void testUnderweightBMI() {
        double bmi = BMICalculator.calculateBMI(45, 1.60);
        assertEquals(17.58, bmi, 0.01);
    }

    @Test
    public void testOverweightBMI() {
        double bmi = BMICalculator.calculateBMI(85, 1.70);
        assertEquals(29.41, bmi, 0.01);
    }

    @Test
    public void testZeroHeightThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(60, 0));
    }

    @Test
    public void testNegativeWeightThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-70, 1.80));
    }
}
