package Q2_CheckVowel;

public class CheckVowel {
    public static void main(String[] args) {

        char character='i';
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};

        for(char c:vowels)
        {
            if((character>='a'&&character<='z')||(character>='A'&&character<='Z')) {
                if (character == c) {
                    System.out.println(character + " is a vowel");
                    break;
                } else {
                    System.out.println(character + " is a consonant");
                    break;
                }
            }else
            {
                System.out.println(character+" is not an alphabet");
                break;
            }


        }


    }
}
