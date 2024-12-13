package Q50_RemoveVowels;

public class RemoveVowels {
    public static String removeVowels(String input) {

        StringBuilder result = new StringBuilder(input);

        for (int i = 0; i < result.length(); i++) {

            char character =Character.toLowerCase(result.charAt(i)) ;

            if ( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                result.deleteCharAt(i);
            }

        }

        return result.toString();
    }


    public static void main(String[] args) {
        String input = "Hello Robosoft.";
        String result = removeVowels(input);

        System.out.println("result : " + result);
    }

}
