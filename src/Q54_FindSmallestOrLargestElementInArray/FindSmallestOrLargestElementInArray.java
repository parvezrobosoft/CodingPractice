package Q54_FindSmallestOrLargestElementInArray;

import Q51_SortArray.ArrayOperation;

public class FindSmallestOrLargestElementInArray {

    public static void main(String[] args) {
        int[] array={1,2,3,4,-3,0};
        ArrayOperation find =new ArrayOperation();

        System.out.println("Largest element : "+find.getLargestElement(array));
        System.out.println("Smallest element : "+find.getSmallestElement(array));





    }

}
