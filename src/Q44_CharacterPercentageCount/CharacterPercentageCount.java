package Q44_CharacterPercentageCount;

public class CharacterPercentageCount {

        public static void findCharacterPercentage(String input) {
            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int digitCount = 0;
            int specialCount = 0;

            int totalCount = 0;


            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                totalCount++;

                int charCode = (int) ch;

                if (charCode >= 65 && charCode <= 90) {
                    uppercaseCount++;
                }
                else if (charCode >= 97 && charCode <= 122) {
                    lowercaseCount++;
                }
                else if (charCode >= 48 && charCode <= 57) {
                    digitCount++;
                }
                else {
                    specialCount++;
                }
            }

            double uppercasePercentage = (uppercaseCount / (double) totalCount) * 100;
            double lowercasePercentage = (lowercaseCount / (double) totalCount) * 100;
            double digitPercentage = (digitCount / (double) totalCount) * 100;
            double specialPercentage = (specialCount / (double) totalCount) * 100;

            System.out.println("uppercase percentage: " + uppercasePercentage + "%");
            System.out.println(" lowercase percentage: " + lowercasePercentage + "%");
            System.out.println(" digits percentage : " + digitPercentage + "%");
            System.out.println(" special percentage: " + specialPercentage + "%");
        }

        public static void main(String[] args) {
            String input = "Parvez@ 23";
            findCharacterPercentage(input);
        }
    }

