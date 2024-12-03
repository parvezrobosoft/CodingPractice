package Q32_CheckStringHasUniqueCharacters;

import Q33_FrequencyOfCharactersInAString.FrequencyCounter;

import java.util.Map;

public class UniqueCharacter
{

    public boolean hasUniqueCharacters(String string)
    {
        FrequencyCounter frequencyCounter=new FrequencyCounter();
        Map<Character,Integer> frequency=frequencyCounter.getCharacterFrequency(string);

        for (Map.Entry<Character,Integer> entry:frequency.entrySet())
        {
            if (entry.getValue()>1)
                return false;
        }


        return true;
    }

}
