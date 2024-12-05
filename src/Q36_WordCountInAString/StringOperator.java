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

        // Insert the word in the middle of the original string
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















}
