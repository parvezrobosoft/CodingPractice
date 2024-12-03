package Q3_PrimeFactors;

public class PrimeFactorsOfANumber {

    public static void getPrimeFactors(int number)
    {
        System.out.print("Prime factors of "+number+" are : ");
        for(int i=2;i<=number;i++)
        {
            while(number%i==0)
            {
                System.out.print(i+" ");
                number=number/i;
            }
        }

    }


    public static void main(String[] args) {

        int number=1728;
        getPrimeFactors(number);
    }

}
