package Q24_SumOfEvenIndexFibanocci;

import Q14_FibanocciSeries.Fibanocci;

import java.util.List;

public class SumOfEvenFibanocci {
    public static void main(String[] args) {

        int number=5;

        Fibanocci fibanocci=new Fibanocci();

        List<Integer> series=fibanocci.getFibanocci(number*2);

        System.out.print("Sum of Fibonacci Series Numbers of First N Even Indexes is ");
        int i=1;
        int sum=0;

            for (int num:series) {
                if (i%2==0)
                    sum+=num;

                i++;
            }
        System.out.println(sum);


    }
}
