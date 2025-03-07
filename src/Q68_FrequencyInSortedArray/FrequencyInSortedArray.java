package Q68_FrequencyInSortedArray;

public class FrequencyInSortedArray {

    public static void getFrequency(int[] array)
    {

    int count = 1;

        for (int i = 1; i < array.length; i++) {
        if (array[i] == array[i - 1]) {
            count++;
        } else {
            System.out.println(array[i - 1] + ": " + count);
            count = 1;
        }
    }

        System.out.println(array[array.length - 1] + ": " + count);
}

public static void main(String[] args) {
    int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4};
    getFrequency(arr);
}

}
