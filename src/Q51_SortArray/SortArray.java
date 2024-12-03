package Q51_SortArray;

public class SortArray {
    public static void main(String[] args) {


        int[] array={1,23,43,12,42,33};

        ArrayOperation arraySorter=new ArrayOperation();

        arraySorter.sortAscending(array);
        arraySorter.printArray(array);

        arraySorter.sortDescending(array);
        arraySorter.printArray(array);

    }
}
