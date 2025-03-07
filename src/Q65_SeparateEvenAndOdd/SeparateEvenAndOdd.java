package Q65_SeparateEvenAndOdd;

import java.util.Arrays;

public class SeparateEvenAndOdd {

    public static int[] separateEvenAndOddNumbers(int[] array)
    {
        for (int i=0;i<array.length-1;i++)
        {
                for (int j =i;j< array.length;j++)
                {
                    if(array[j]%2==0)
                    {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,0,-2,-4};

        System.out.println("After separating even and odd : ");
        System.out.println(Arrays.toString(separateEvenAndOddNumbers(array)));
    }

}
