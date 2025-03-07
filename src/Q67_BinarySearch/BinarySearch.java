package Q67_BinarySearch;

public class BinarySearch {

    public static boolean binarySearch(int[] array, int number) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return true;
            }

            if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int number = 1;

        boolean result = binarySearch(array, number);
        System.out.println("Element found: " + result);
    }
}


