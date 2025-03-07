package Q64_SeperateZerosAnsOnes;

import java.util.Arrays;

public class SeparateZerosAndOnes {

    public static int[] separateZerosAndOnes(int[] array) {
        int first = 0;
        int last = array.length - 1;

        for (; first < last; first++) {
            if (array[first + 1] == 0) {
                for (int i = first; i >= 0; i--) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {

        int[] array={1,0,1,0,1,0,1};

        System.out.println(Arrays.toString(separateZerosAndOnes(array)));
    }
}
