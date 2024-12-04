package Q57_PrintEvenPositionedNumbers;

import Q51_SortArray.ArrayOperation;

public class PrintEvenPositionedNumbers {
    public static void main(String[] args) {

        ArrayOperation operation=new ArrayOperation();

        int[] array={1,2,3,4,5,6,7,8,9};

        System.out.println("Even Positioned Numbers are : ");

        operation.printOddOrEvenPositionedNumbers(array,2);

    }


}
