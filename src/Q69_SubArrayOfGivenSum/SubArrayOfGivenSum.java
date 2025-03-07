package Q69_SubArrayOfGivenSum;

public class SubArrayOfGivenSum {
        public static void findSubarraysWithGivenSum(int[] arr, int targetSum) {
            int n = arr.length;

            for (int start = 0; start < n; start++) {
                int currentSum = 0;

                for (int end = start; end < n; end++) {
                    currentSum += arr[end];

                    if (currentSum == targetSum) {
                        System.out.println("Sub array found from index " + start + " to " + end);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = { 2, 3, 7, 5};
            int targetSum = 12;
            findSubarraysWithGivenSum(arr, targetSum);
        }
    }

