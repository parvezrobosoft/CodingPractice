package Q15_ReverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 1345;
        Reverse reverseNumber = new Reverse();


        int result = reverseNumber.reverse(number);

        System.out.println("The reversed number is: " + result);
    }
}
