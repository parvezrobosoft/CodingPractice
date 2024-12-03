package Q7_SumOfDigitsOfANumber;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {

        int number=285;
        int result;

        SumOfDigits sum=new SumOfDigits();
        result=sum.getSumOfDigits(number);
        System.out.println("sum of digits of "+number+ " is "+result);

    }
}
