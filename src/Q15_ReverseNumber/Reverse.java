package Q15_ReverseNumber;

public class Reverse {

    public int reverse(int num) {

        int reversed = 0;

        int temp=0;
        while (num != 0) {
            temp = num % 10;
            reversed = reversed * 10 + temp;
            num = num / 10;
        }

        return reversed;
    }
}
