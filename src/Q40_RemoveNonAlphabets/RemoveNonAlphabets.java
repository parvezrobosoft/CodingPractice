package Q40_RemoveNonAlphabets;

import Q36_WordCountInAString.StringOperator;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String string="String@#123";
        StringOperator operator=new StringOperator();

        System.out.println(operator.removeNonAlphabets(string));

    }
}
