package Q6_AddingFractions;

public class Fraction
{

    private int numerator;
    private int denominator;

    Fraction(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
