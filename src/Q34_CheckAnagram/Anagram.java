package Q34_CheckAnagram;

import Q33_FrequencyOfCharactersInAString.FrequencyCounter;
import jdk.jfr.Frequency;

import java.util.Map;

public class Anagram {
    public boolean isAnagram(String string1,String string2)
    {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        Map<Character,Integer> string1Frequency=frequencyCounter.getCharacterFrequency(string1);
        Map<Character,Integer> string2Frequency=frequencyCounter.getCharacterFrequency(string2);

        if(string1Frequency.equals(string2Frequency))
        {
            return true;
        }
        return false;
    }
}
