package Q74_LargestSumOfContiguousSubArray;

public class LargestSumOfContiguousSubArray {

    public static int getLargestSumOfSubarray(int[] arr) {

        int largestSum=0;
        int sum;
        int n = arr.length;

        for (int first = 0; first < n; first++) {

            sum = 0;

            for (int last = first ; last < n; last++) {
                sum += arr[last];
                if (sum > largestSum){
                    largestSum=sum;
                }
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        int[] arr = { -1,2, 3, 7, 5};
        int result=getLargestSumOfSubarray(arr);
        System.out.println("Largest Sum Of SubArray is "+result);
    }

}
