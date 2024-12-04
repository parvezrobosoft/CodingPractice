package Q29_PalimdromeCheck;

public class Palindrome {
    public boolean isPalindrome(String string)
    {
        StringBuilder reversedString=new StringBuilder(string).reverse();

        if(string.equals(reversedString.toString()))
        {
           return true;
        }

        return false;
    }
}
