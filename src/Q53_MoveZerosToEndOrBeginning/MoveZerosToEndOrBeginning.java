package Q53_MoveZerosToEndOrBeginning;

import Q51_SortArray.ArrayOperation;

public class MoveZerosToEndOrBeginning {
    public static void main(String[] args) {

        int[] array={1,0,2,0,3,0,4};

        ArrayOperation moveZero=new ArrayOperation();

        moveZero.moveZerosToEnd(array);
        moveZero.printArray(array);

        moveZero.moveZerosToBeginning(array);
        moveZero.printArray(array);

    }

}
