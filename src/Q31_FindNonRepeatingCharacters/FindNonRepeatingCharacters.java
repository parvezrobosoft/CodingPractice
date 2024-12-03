package Q31_FindNonRepeatingCharacters;

import Q33_FrequencyOfCharactersInAString.FrequencyCounter;

import java.util.Map;

public class FindNonRepeatingCharacters {
    public static void main(String[] args) {
        String string="123_bhjbh@2";

        FrequencyCounter frequencyCounter=new FrequencyCounter();
        Map<Character,Integer> frequency=frequencyCounter.getCharacterFrequency(string);

        System.out.println("Unique characters are ");

        for (Map.Entry<Character,Integer> entry:frequency.entrySet())
        {
            if (entry.getValue()==1)
                System.out.print(entry.getKey()+" ");
        }
    }
}
