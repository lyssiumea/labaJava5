public final class Fraction implements fractionInterface { // сущ-ть Дроби

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = Math.abs(denominator);
        if (denominator < 0) {
            this.numerator = -this.numerator;
        }
    }

//    public int getNumerator() {
//        return numerator;
//    }
//    public int getDenominator() {
//        return denominator;
//    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        this.denominator = Math.abs(denominator);
        if (denominator < 0) {
            this.numerator = -this.numerator;
        }
    }

    @Override
    public double getDecimalValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

}
