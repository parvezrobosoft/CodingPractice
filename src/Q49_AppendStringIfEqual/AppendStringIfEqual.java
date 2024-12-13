package Q49_AppendStringIfEqual;

public class AppendStringIfEqual {

        public static String appendStrings(String string1, String string2) {


            if (string1.length() > string2.length()) {
                string1 = string1.substring(string1.length()- string2.length());
            } else if (string2.length() > string1.length()) {
                string2 = string2.substring(string2.length()- string1.length());
            }

            return string1 + string2;
        }

        public static void main(String[] args) {
            String string1 = "HelloWorld";
            String string2 = "Java";

            String result = appendStrings(string1, string2);
            System.out.println("Result : " + result);
        }
    }

