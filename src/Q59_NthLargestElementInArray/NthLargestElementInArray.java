package Q59_NthLargestElementInArray;

import Q51_SortArray.ArrayOperation;

public class NthLargestElementInArray {
    public static void main(String[] args) {
        ArrayOperation operation=new ArrayOperation();
        int[] array={12,34,56,43,12,56,23,45,32};

        int N=2;

        System.out.println(operation.getNthLargestElementInArray(array,N));
    }
}
