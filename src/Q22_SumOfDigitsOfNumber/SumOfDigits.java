package Q22_SumOfDigitsOfNumber;

public class SumOfDigits {
    public static int sumOfDigits(int number) {

       int sum = 0;

       while (number>=10) {
           sum = 0;
           while (number > 0) {


               sum += number % 10;
               number /= 10;
           }

           number = sum;
       }

        return number;
    }
}
