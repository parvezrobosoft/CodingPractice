package Q33_FrequencyOfCharactersInAString;

import java.util.Map;

public class FrequencyOfCharactersInAString {
    public static void main(String[] args) {

        String string="characters in a string ";

        FrequencyCounter counter=new FrequencyCounter();

        Map<Character,Integer> frequency =counter.getCharacterFrequency(string);

        for (Map.Entry<Character,Integer> entry: frequency.entrySet())
        {
            System.out.println("'"+entry.getKey()+"' = "+entry.getValue());
        }
    }
}
