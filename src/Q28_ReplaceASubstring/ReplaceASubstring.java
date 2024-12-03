package Q28_ReplaceASubstring;

public class ReplaceASubstring {
    public static void main(String[] args) {

        String string="Java is a programming language";

        String toReplace="Java";

        String newSubstring="Python";

        String newString=string.replace(toReplace,newSubstring);

        System.out.println("Before Replacing : "+string);
        System.out.println("After Replacing : "+newString);

    }

}
