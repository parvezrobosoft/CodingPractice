package Q11_BinaryToDecimalConversion;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        int binary=1101;
        int decimal;

        BinaryDecimalConverter converter =new BinaryDecimalConverter();

        decimal=converter.binaryToDecimal(binary);

        System.out.println(binary+" : "+decimal);

    }



}
