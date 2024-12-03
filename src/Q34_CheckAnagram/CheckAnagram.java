package Q34_CheckAnagram;

public class CheckAnagram {
    public static void main(String[] args) {

        String string1="silet";
        String string2="listen";

        Anagram anagram=new Anagram();

        if(anagram.isAnagram(string1,string2))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");

        }
    }
}
