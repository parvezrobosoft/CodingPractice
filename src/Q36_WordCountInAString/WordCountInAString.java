package Q36_WordCountInAString;

public class WordCountInAString {
    public static void main(String[] args) {


        String string="hii how are you doing";
        int wordcount;

        StringOperator wordCounter=new StringOperator();
         wordcount=wordCounter.getWordCount(string);
        System.out.println(wordcount);
    }

}
