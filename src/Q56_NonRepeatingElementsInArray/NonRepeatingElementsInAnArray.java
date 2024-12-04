package Q56_NonRepeatingElementsInArray;

import Q51_SortArray.ArrayOperation;

import java.util.List;

public class NonRepeatingElementsInAnArray {
    public static void main(String[] args) {

        List<Integer> nonRepeatingElements;
        ArrayOperation operation=new ArrayOperation();

        int[] array={2,3,4,5,6,2,4,6,8,9,8};

        nonRepeatingElements=operation.getNonRepeatingElements(array);

        System.out.println("Non Repeating elements are : "+nonRepeatingElements);
    }
}
