package Q38_InsertWordInMiddle;

import Q36_WordCountInAString.StringOperator;

public class InsertWordInMiddle {
    public static void main(String[] args) {

        String string="hi";
        String insertString="awa";
        StringOperator operator=new StringOperator();
        String result;
        result= operator.insertWordInMiddle(string,insertString);
        System.out.println(result);

    }
}
