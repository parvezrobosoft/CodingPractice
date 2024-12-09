package Q42_CheckRotation;

import Q36_WordCountInAString.StringOperator;

public class CheckRotation
{
    public static void main(String[] args) {
        String string1 = "abcde";
        String string2 = "cdea";

        StringOperator operator=new StringOperator();
        if (operator.isRotation(string1,string2)) {
            System.out.println(string2 + " is a rotation of " + string1);
        } else {
            System.out.println(string2 + " is not a rotation of " + string1);
        }
    }
}
