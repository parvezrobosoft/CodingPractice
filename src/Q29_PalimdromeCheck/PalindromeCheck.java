package Q29_PalimdromeCheck;

public class PalindromeCheck {
    public static void main(String[] args) {
        String string="qfertrefq";

       Palindrome palindrome=new Palindrome();

       if(palindrome.isPalindrome(string))
       {
           System.out.println("Given String is a palindrome");
       }
       else {
           System.out.println("Given String is not a palindrome");

       }
    }
}
