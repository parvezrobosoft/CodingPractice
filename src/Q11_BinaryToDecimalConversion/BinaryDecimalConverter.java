package Q11_BinaryToDecimalConversion;

public class BinaryDecimalConverter {
    static int binaryToDecimal(int n)
    {
        int binary = n;
        int decimal = 0;
        int multiplier = 1;

        int temp = binary;
        int lastDigit;

        while (temp > 0) {
            lastDigit = temp % 10;
            temp = temp / 10;

            decimal += lastDigit * multiplier;

            multiplier = multiplier * 2;
        }

        return decimal;
    }
}
