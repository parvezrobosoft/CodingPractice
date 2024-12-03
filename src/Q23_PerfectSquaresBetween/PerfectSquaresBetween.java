package Q23_PerfectSquaresBetween;

import Q19_CheckPerfectSquare.PerfectSquare;

public class PerfectSquaresBetween {
    public static void main(String[] args) {

        int a=10;
        int b=500;
        PerfectSquare squares =new PerfectSquare();
        System.out.println("Perfect squares between "+a+" and "+b +" are ");
       squares.getPerfectSquares(a,b);

    }
}
