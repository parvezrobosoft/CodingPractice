package Q14_FibanocciSeries;

import java.util.ArrayList;
import java.util.List;

public class Fibanocci {

    public void printFibonacci(int n) {

        List<Integer> series=getFibanocci(n);
        System.out.print("Fibonacci Series of " + n + " terms: ");
        for (int i:series)
            System.out.print(i+" ");
    }



    public List<Integer> getFibanocci(int n)
    {
        int firstTerm = 0;
        int secondTerm = 1;
        List<Integer> result =new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        return result;
    }

}

