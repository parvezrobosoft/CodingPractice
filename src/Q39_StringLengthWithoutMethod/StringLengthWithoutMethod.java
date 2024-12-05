package Q39_StringLengthWithoutMethod;

import Q36_WordCountInAString.StringOperator;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String string="helllooo";

        StringOperator operator=new StringOperator();
        int length=operator.getLength(string);
        System.out.println("Length of string is "+length);
    }
}
