package Q36_WordCountInAString;

public class StringOperator {

    public int getWordCount(String string)
    {

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }

        }

        if (inWord) {
            wordCount++;
        }


        return wordCount;
    }

    public String removeWhiteSpaces(String string)
    {
        String result="";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                result += string.charAt(i);
            }
        }
        return result;
    }

    public String insertWordInMiddle (String string,String insert)
    {
        int middleIndex = string.length() / 2;

        String result = string.substring(0, middleIndex) + insert + string.substring(middleIndex);

        return result;
    }

    public int getLength(String string)
    {

        int length=0;
        while (true) {
            try {
                char c = string.charAt(length);
                length++;
            } catch (Exception e) {
                break;
            }
        }
        return length;
    }

    public String removeNonAlphabets(String string)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            if (( string.charAt(i) >= 'A' &&  string.charAt(i) <= 'Z') || ( string.charAt(i) >= 'a' &&  string.charAt(i) <= 'z')) {
                result.append(string.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    public void getCaseCount(String string)
    {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c >= 65 && c <= 90) {
                upperCaseCount++;
            }
            else if (c >= 97 && c <= 122) {
                lowerCaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);

    }

    public boolean isRotation(String string1, String string2) {


        for (int i = 0; i < string1.length(); i++) {

            if ((string1.substring(i) + string1.substring(0, i)).equals(string2)) {
                return true;
            }
        }

        return false;
    }













}
