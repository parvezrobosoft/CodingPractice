package Q33_FrequencyOfCharactersInAString;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {


    public Map<Character,Integer> getCharacterFrequency(String string)
    {
        Map<Character,Integer> frequency =new HashMap<>() ;
        for (char c : string.toCharArray()) {
            if(c==' ')continue;
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }

            return frequency;
    }

}
