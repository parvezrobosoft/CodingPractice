package Q52_ReverseAnArray;

import Q51_SortArray.ArrayOperation;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};

        ArrayOperation reverseArray=new ArrayOperation();
        reverseArray.reverseArray(array);
        reverseArray.printArray(array);
    }
}
