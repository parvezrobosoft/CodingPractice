package Q47_ConcatenateStrings;

public class ConcatenateStrings {
        public static String appendStrings(String string1, String string2) {


            if (string1.charAt(string1.length() - 1) == string2.charAt(0)) {
                return string1 + string2.substring(1);
            }

            return string1 + string2;
        }

        public static void main(String[] args) {
            String string1 = "hello";
            String string2 = "oRobo";

            String result = appendStrings(string1, string2);
            System.out.println("result : " + result);
        }
    }

