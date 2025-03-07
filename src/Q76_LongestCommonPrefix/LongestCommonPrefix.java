package Q76_LongestCommonPrefix;

public class LongestCommonPrefix {

        public static String longestCommonPrefix(String[] stringArray) {

            if (stringArray == null || stringArray.length == 0) {
                return "";
            }

            StringBuilder prefix = new StringBuilder(stringArray[0]);

            for (int i = 1; i < stringArray.length; i++) {

                while (stringArray[i].indexOf(prefix.toString()) != 0) {

                    prefix.setLength(prefix.length() - 1);

                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            return prefix.toString();
        }

        public static void main(String[] args) {

            String[] stringArray = {"flower", "flow", "flight"};

            String result = longestCommonPrefix(stringArray);
            System.out.println("Longest Common Prefix: " + result);
        }
    }


