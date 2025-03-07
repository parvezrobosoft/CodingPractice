package Q81_StringPercentage;

public class StringPercentage {
    public static void getStringPercentage(String string){
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int totalNumbers = 0;
        int specialCharacters = 0;
        int total = string.length();

        for (int i = 0; i < total; i++) {
            char ch = string.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            } else if (Character.isDigit(ch)) {
                totalNumbers++;
            } else {
                specialCharacters++;
            }
        }

        if (total > 0) {
            double upperPercentage = (upperCaseLetters * 100.0) / total;
            double lowerPercentage = (lowerCaseLetters * 100.0) / total;
            double digitPercentage = (totalNumbers * 100.0) / total;
            double specialPercentage = (specialCharacters * 100.0) / total;

            System.out.println("PERCENTAGE:");
            System.out.println("Uppercase Letters : " + upperPercentage + " %");
            System.out.println("Lowercase Letters : " + lowerPercentage + " %");
            System.out.println("Digits : " + digitPercentage + " %");
            System.out.println("Special Characters : " + specialPercentage + " %");
        } else {
            System.out.println("The input string is empty.");
        }
    }
    public static void main(String[] args) {
        String string = "HiiHowAreYou1234@!#%";

        getStringPercentage(string);
    }
}

