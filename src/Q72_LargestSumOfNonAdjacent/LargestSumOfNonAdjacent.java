package Q72_LargestSumOfNonAdjacent;

public class LargestSumOfNonAdjacent {

        public static int getLargestSumOfNonAdjacent(int[] array) {

            int largestSum = 0;

            int sum;

            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length; j++) {

                    if (j!=i+1&&j!=i-1&&i!=j)
                    {
                        sum=array[i]+array[j];
                        if(sum>largestSum)
                            largestSum=sum;
                    }


                }
            }

            return largestSum;
        }

        public static void main(String[] args) {

            int[] array = {1, 2, 7, 10};

            int result = getLargestSumOfNonAdjacent(array);
            System.out.println("Largest sum is " + result);

        }

}
