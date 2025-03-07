package Q75_ContiguousSubarrayOfGivenSum;

public class ContiguousSubArrayOfGivenSum {


        public static void findLargestSumOfSubarray(int[] array,int givenSum) {

            int sum;
            int n = array.length;

            System.out.println("Subarray of Sum "+givenSum+" : ");
            for (int first = 0; first < n; first++) {

                sum = 0;

                for (int last = first ; last < n; last++) {
                    sum += array[last];
                    if (sum == givenSum){
                        givenSum = sum;
                        System.out.println("Subarray index from "+first+" to "+last);
                    }

                }
            }
        }

        public static void main(String[] args) {
            int[] array = { -1,2, 3, 7, 5};
            int givenSum=5;
            findLargestSumOfSubarray(array,givenSum);
        }



}
