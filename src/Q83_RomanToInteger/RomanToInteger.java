package Q83_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
        public static int ConvertRomanToInteger(String s) {

            Map<Character,Integer> romanValues=new HashMap<>();

            romanValues.put('I', 1);
            romanValues.put('V', 5);
            romanValues.put('X',10);
            romanValues.put('L',50);
            romanValues.put('C',100);
            romanValues.put('D',500);
            romanValues.put('M',1000);

            int result = 0;

            for (int i = 0; i < s.length(); i++) {

                int currentValue = romanValues.get(s.charAt(i));

                if (i + 1 < s.length() && currentValue < romanValues.get(s.charAt(i + 1))) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            String givenRoman = "XLCDM";
            System.out.println("Result " + ConvertRomanToInteger(givenRoman));
        }
    }

