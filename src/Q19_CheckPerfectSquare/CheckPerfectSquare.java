package Q19_CheckPerfectSquare;

public class CheckPerfectSquare {
    public static void main(String[] args) {

        int number=-26;

        PerfectSquare perfectSquare=new PerfectSquare();

        if(number>=0) {
            if (perfectSquare.isPerfectSquare(number)) {
                System.out.println(number + " is a perfect square.");
            } else {

            }
        }
            else
        {
            System.out.println(number + " is not positive.");
        }
    }
}
