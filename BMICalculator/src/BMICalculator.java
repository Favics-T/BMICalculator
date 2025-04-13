public class BMICalculator {
    public static double calculateBMI(double weightKg, double heightMeters) {
        if (weightKg <= 0 || heightMeters <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than 0");
        }
        return weightKg / (heightMeters * heightMeters);
    }
}