package Q82_MaximumProductInSubArray;

public class MaximumProductInSubArray {
        public static int maxProductInSubArray(int[] array) {
            if (array.length == 0) {
                return 0;
            }
            int maximum = array[0];
            int minimum = array[0];
            int finalMaximum = array[0];

            for (int i = 1; i < array.length; i++) {

                if(array[i]!=0)
                    maximum = Math.max(array[i], maximum * array[i]);

                minimum = Math.min(array[i], minimum * array[i]);

                finalMaximum =Math.max( Math.max(minimum, maximum),finalMaximum);
            }

            return finalMaximum;
        }

        public static void main(String[] args) {

            int[] array = { -2, -4,2, 0};

            System.out.println("Maximum Product is " + maxProductInSubArray(array));

        }
    }

