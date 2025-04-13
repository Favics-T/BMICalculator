import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InvestmentCalculatorTest {

    @Test
    public void testAnnualInvestment() {
        double result = InvestmentCalculator.calculateFinalInvestment(1000, InvestmentType.ANNUAL);
        assertEquals(1953.12, result, 0.01);
    }

    @Test
    public void testBiannualInvestment() {
        double result = InvestmentCalculator.calculateFinalInvestment(1000, InvestmentType.BIANNUAL);
        assertEquals(3723.88, result, 0.01);
    }

    @Test
    public void testTriannualInvestment() {
        double result = InvestmentCalculator.calculateFinalInvestment(1000, InvestmentType.TRIANNUAL);
        assertEquals(6859.00, result, 0.01);
    }

    @Test
    public void testZeroInvestmentThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
            InvestmentCalculator.calculateFinalInvestment(0, InvestmentType.ANNUAL));
    }
}
