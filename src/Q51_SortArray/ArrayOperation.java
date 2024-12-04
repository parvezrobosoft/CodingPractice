package Q51_SortArray;

import java.util.*;

public class ArrayOperation {
    public void sortDescending(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public void sortAscending(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void reverseArray(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        for (int i = firstIndex; i < lastIndex; i++) {

            int temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;

        }
    }

    public void moveZerosToEnd(int[] array) {
        int first = 0;
        int last = array.length - 1;

        for (; first < last - 1; first++) {
            for (int i = first; i < last; i++) {
                if (array[i] == 0) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }

        }

    }

    public void moveZerosToBeginning(int[] array) {
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
    }


    public int getLargestElement(int[] array)
    {
        int max=array[0];
        int first=0;
        int last=array.length-1;


        for (int i = first; i <= last ; i++) {
            if(array[i]>max)
            {
                max=array[i];
            }
        }

        return max;
    }

    public int getSmallestElement(int[] array)
    {
        int min=array[0];
        int first=0;
        int last=array.length-1;


        for (int i = first; i <= last ; i++) {
            if(array[i]<min)
            {
                min=array[i];
            }
        }

        return min;
    }


    public List<Integer> getNonRepeatingElements(int[] array)
    {
        List<Integer> nonRepeatingElements=new ArrayList<>();
        Map<Integer,Integer> frequency=new HashMap<>();

        for (int i:array)
        {
            if (frequency.containsKey(i))
            {
                frequency.put(i, frequency.get(i) + 1);
            }else {
                frequency.put(i, 1);
            }
        }

        for (Map.Entry<Integer,Integer> set:frequency.entrySet())
        {
            if (set.getValue()==1)
            {
                nonRepeatingElements.add(set.getKey());

            }
        }

        return nonRepeatingElements;
    }


    public  void  printOddOrEvenPositionedNumbers(int[] array,int index)
    {
        int i=0;
        if(index==1)
            i=1;

        for (int element:array)
        {
            if(i%2==1)
                System.out.print(element+" ");

            i++;
        }
    }


    public int getNthLargestElementInArray(int[] array,int rank)
    {
        Set<Integer> unique =new HashSet<>();
        for (int i:array)
            unique.add(i);


        Integer[] sortedArray=new Integer[unique.size()];
        unique.toArray(sortedArray);
        Arrays.sort(sortedArray,Collections.reverseOrder());

        return sortedArray[rank-1];
    }





}
