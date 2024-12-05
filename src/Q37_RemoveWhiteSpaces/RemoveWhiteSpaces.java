package Q37_RemoveWhiteSpaces;

import Q36_WordCountInAString.StringOperator;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String string="hi hoe are you";
        String result;
        StringOperator operator=new StringOperator();

        result= operator.removeWhiteSpaces(string);

        System.out.println(result);
    }

}
