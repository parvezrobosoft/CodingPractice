package Q7_SumOfDigitsOfANumber;

public class SumOfDigits {



    public int getSumOfDigits(int number)
    {
        int sum=0;

        while(number!=0)
        {
            sum+=number%10;
            number=number/10;
        }

        return sum;

    }


}
