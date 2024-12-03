package Q8_SumOfNaturalNumbers;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        int number=100;
        long result;

        NaturalNumbers sum = new NaturalNumbers();
        result=sum.getSumOfNaturalNumbers(number);

        System.out.println("Sum of "+number+" natural number is "+result);
    }
}
