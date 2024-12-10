package Q45_CharacterCount;

public class CharacterCount {


        public static int countOccurrences(String str, char character) {

            int i=0;

            if (str.isEmpty()) {
                return 0;
            }
            if(str.charAt(0)==character) {
                 i=1;
            }

                return i + countOccurrences(str.substring(1), character);
        }

        public static void main(String[] args) {
            String string = "hi How are you";
            char character = 'o';

            int count = countOccurrences(string, character);

            System.out.println("'"+character + "' count : " +count);
        }
    }

