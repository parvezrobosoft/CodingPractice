package Q8_SumOfNaturalNumbers;

public class NaturalNumbers {

    public long getSumOfNaturalNumbers(int to)
    {
        long sum=0;
        for (int i = 1; i <=to ; i++) {
            sum+=i;
        }
        return sum;
    }
}
