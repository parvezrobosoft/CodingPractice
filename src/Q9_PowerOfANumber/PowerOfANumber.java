package Q9_PowerOfANumber;

public class PowerOfANumber {
    public static void main(String[] args) {

        PowerOf power=new PowerOf();

        int base=3;
        int exponent=4;
        long result;

        result=power.getPowerOf(base,exponent);

        System.out.println(base+" raised to "+exponent+" is "+result);
    }
}
