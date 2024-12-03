package Q29_PalimdromeCheck;

public class PalindromeCheck {
    public static void main(String[] args) {
        String string="qfertreq";

       StringBuilder reversedString=new StringBuilder(string).reverse();

       if(string.equals(reversedString.toString()))
       {
           System.out.println("Given String is a palindrome");
       }
       else {
           System.out.println("Given String is not a palindrome");

       }
    }
}
