package Q70_FirstRepeatingElementInArray;

public class FirstRepeatingElementInArray {

        public static int findFirstRepeatingElement(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        return array[i];
                    }
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7};
            int result = findFirstRepeatingElement(array);
            if (result == -1) {
                System.out.println("No repeating elements found.");
            } else {
                System.out.println("First repeating element: " + result);
            }
        }
    }

