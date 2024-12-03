package Q19_CheckPerfectSquare;

public class PerfectSquare {
    public  boolean isPerfectSquare(int num) {
        int sqrt;

        sqrt = (int) Math.sqrt(num);

        return (sqrt == Math.sqrt(num));
    }

    public void getPerfectSquares(int first,int last)
    {
        for (int i = first; i <=last; i++) {
            if (isPerfectSquare(i))
                System.out.print(i+" ");

        }
    }
}
