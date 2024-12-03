package Q27_ArmstrongNumberCheck;

public class Armstrong {
    public static boolean isArmstrong(int number) {
        int givenNumber = number;

        int numDigits = String.valueOf(number).length();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            sum += Math.pow(digit, numDigits);

            number /= 10;
        }

        return sum == givenNumber;
    }
}
