package Q27_ArmstrongNumberCheck;

public class ArmStrongNumberCheck {
    public static void main(String[] args) {

        int number=36;

        if(Armstrong.isArmstrong(number))
        {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }
    }
}
