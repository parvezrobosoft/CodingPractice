package Q66_MissingNumberInAP;

import java.util.Arrays;

public class MissingNumberInAP {


        public static int findMissingAP(int[] array) {

            Arrays.sort(array);

            int commonDifference = array[1] - array[0];

            for (int i = 2; i < array.length; i++) {
                if (array[i] - array[i - 1] != commonDifference) {
                    int n = array.length + 1;
                     commonDifference = (array[array.length - 1] - array[0]) / array.length;

                    for ( i = 0; i < array.length - 1; i++) {
                        if (array[i + 1] - array[i] != commonDifference) {
                            return array[i] + commonDifference;
                        }
                    }
                }
            }

            return array[array.length-1]+commonDifference;
        }

            public static void main(String[] args) {
                int[] array = {3,5,7,9};
                System.out.println("Missing number is: " + findMissingAP(array));
            }

}
