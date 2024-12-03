package Q20_CheckIfSumOfTwoSquares;

public class CheckIfSumOfTwoSquares {
    public static void main(String[] args) {

        int number=109;
        int sum=0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <number-i ; j++) {
                sum=0;
                sum= (int) (Math.pow(i,2)+Math.pow(j,2));
                if(sum==number)break;
            }
            if(sum==number)break;
        }

        if (sum==number)
        {
            System.out.println(number+" is a sum of two squares");
        }
        else
        {
            System.out.println(number+" is not a sum of two squares");
        }
    }
}
