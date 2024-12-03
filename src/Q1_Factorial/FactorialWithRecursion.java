package Q1_Factorial;

public class FactorialWithRecursion {

    public static int factorial(int n)
    {
        if (n==0||n==1)
        {
            return 1;
        } else if (n>1) {
            return n*factorial(n-1);
        }
        return 0;
    }

    public static void main(String[] args) {

        int number=6;
        int factorial;

        factorial=factorial(number);

        System.out.println("Factorial of "+number+" is "+factorial);

    }
}
