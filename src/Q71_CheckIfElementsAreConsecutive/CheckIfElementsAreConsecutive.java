package Q71_CheckIfElementsAreConsecutive;
import java.util.Arrays;
public class CheckIfElementsAreConsecutive {


        public static boolean isElementsConsecutive(int[] array) {
            int n = array.length;


            Arrays.sort(array);

            for (int i = 1; i < n; i++) {
                if (array[i] != array[i - 1] + 1) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int[] array = {3, 1, 2, 4, 5};
            if (isElementsConsecutive(array)) {
                System.out.println("The array elements are consecutive.");
            } else {
                System.out.println("The array elements are not consecutive.");
            }
        }
    }

