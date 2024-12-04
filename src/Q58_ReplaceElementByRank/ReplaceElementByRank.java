package Q58_ReplaceElementByRank;

import java.util.Arrays;

public class ReplaceElementByRank {

    public static void main(String[] args) {

        int[] array={23,45,67,43,24,55};

        RankOperation replace =new RankOperation();

        replace.replaceElementByRank(array);

        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));

    }
}
