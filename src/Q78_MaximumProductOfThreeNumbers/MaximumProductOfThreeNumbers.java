package Q78_MaximumProductOfThreeNumbers;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {



        public static void findMaxProduct(int[] array) {
            int maxProduct=0;
            if (array.length < 3) {
                System.out.println("Array has less than three elements");
            }
            else {
//            int product;
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array.length; j++) {
//                    for (int k = 0; k < array.length; k++) {
//                        if(i!=j&&i!=k&&j!=k) {
//                            product = array[i] * array[j] * array[k];
//                            if (product > findMaxProduct)
//                                findMaxProduct = product;
//                        }
//                    }
//                }
//            }

                Arrays.sort(array);
                int product1 = array[0] * array[1] * array[array.length - 1];
                int product2 = array[array.length - 2] * array[array.length - 1] * array[array.length - 3];

                if(product1>product2)
                {
                    maxProduct=product1;
                    System.out.print(array[0]+" * " +array[1]+" * "+array[array.length - 1]+" = ");
                } else if (product1 < product2) {
                    maxProduct=product2;
                    System.out.print(array[array.length-3]+" * " +array[array.length-2]+" * "+array[array.length - 1]+" = ");
                }
                else
                {
                    maxProduct=product2;
                    System.out.print(array[0]+" * " +array[1]+" * "+array[array.length - 1]+" = ");
                    System.out.print(array[array.length-3]+" * " +array[array.length-2]+" * "+array[array.length - 1]+" = ");
                }
                System.out.print( maxProduct);
            }

        }

        public static void main(String[] args) {
            int[] arr = { -1,-1,1,1,1};

            findMaxProduct(arr);
        }

}
