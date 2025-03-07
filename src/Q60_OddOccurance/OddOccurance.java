package Q60_OddOccurance;

import Q51_SortArray.ArrayOperation;

import java.util.Arrays;

public class OddOccurance {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,4,3,2,3};

        ArrayOperation operation=new ArrayOperation();

        operation.sortDescending(array);

        System.out.println(Arrays.toString(array));
        int count;

        for(int i=0;i<array.length-1;i++)
        {
            count=1;

            while(array[i]==array[i+1])
            {
                count+=1;
                if(i+1== array.length-1)
                    break;

                i++;
            }

            if (count%2==1)
                System.out.println(array[i] +" count = "+count);

            if (i+1== array.length-1 && array[i]!=array[i+1])
            System.out.println(array[i+1] +" count = 1");
        }
    }
}
