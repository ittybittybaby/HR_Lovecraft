package hrlovecraft;

public enum SalaryTier {
    TERMINATED(0.00, 0.00), LOW(100.00, 999.99), MEDIUM(1000.00, 4999.99), HIGH(5000.00, 20000.00);

    double tierMin;
    double tierMax;

    SalaryTier(double tierMin, double tierMax) {
        this.tierMin = tierMin;
        this.tierMax = tierMax;
    }

    public double getTierMin() {
        return tierMin;
    }

    public double getTierMax() {
        return tierMax;
    }
}