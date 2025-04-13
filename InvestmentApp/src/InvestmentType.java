public enum InvestmentType {
    ANNUAL(0.25),
    BIANNUAL(0.55),
    TRIANNUAL(0.90);

    private final double returnRate;

    InvestmentType(double returnRate) {
        this.returnRate = returnRate;
    }

    public double getReturnRate() {
        return returnRate;
    }
}
