package Q58_ReplaceElementByRank;

import java.util.*;

public class RankOperation {

    public Map<Integer,Integer> getRank(int[] array)
    {
        Map<Integer,Integer> rankList=new HashMap<>();

        Set<Integer> arraySet =new HashSet<>();
        for (int i:array)
            arraySet.add(i);

        Integer[] arrayElements=new Integer[arraySet.size()];
        arrayElements = arraySet.toArray(arrayElements);

        Arrays.sort(arrayElements);

        System.out.println(Arrays.toString(arrayElements));
        int rank=1;
        for (int i :arrayElements )
        {
            rankList.put(i,rank);
            rank++;

        }
        return rankList;
    }

    public void replaceElementByRank(int[] array)
    {
        Map<Integer, Integer> rankList = getRank(array);
        int i=0;
        for (int element:array) {
            array[i] = rankList.get(element);
            i++;
        }

    }




}
