package Q55_LongestPalindromeInArray;

import Q29_PalimdromeCheck.Palindrome;

public class LongestPalindromeInArray {
    public static void main(String[] args) {

        String[] array = {"apple", "madam", "racecar", "ball"};
        String longestPalindrome="";


        Palindrome palindrome=new Palindrome();

        for (String string:array)
        {
            if(palindrome.isPalindrome(string))
            {
                if (string.length()>longestPalindrome.length())
                {
                    longestPalindrome=string;
                }
            }

        }

        System.out.println("Longest Palindrome is : "+longestPalindrome);
    }
}
