public class CashedFraction implements fractionInterface {
    private final Fraction fraction;
    private Double cashedDecimalValue;

    public CashedFraction(Fraction fraction) {
        this.fraction = fraction;
        this.cashedDecimalValue = null;
    }

    @Override
    public void setNumerator(int numerator) {
        fraction.setNumerator(numerator);
        cashedDecimalValue = null; // инвалидируем кэш
    }

    @Override
    public void setDenominator(int denominator) {
        fraction.setDenominator(denominator);
        cashedDecimalValue = null;
    }

    @Override
    public double getDecimalValue() {
        if (cashedDecimalValue == null) {
            cashedDecimalValue = fraction.getDecimalValue();
        }
        return cashedDecimalValue;
    }

    @Override
    public String toString() {
        return fraction.toString();
    }

}
