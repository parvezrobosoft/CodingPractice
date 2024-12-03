package Q32_CheckStringHasUniqueCharacters;

public class CheckUniqueCharacters {
    public static void main(String[] args) {
        String string="i am unqe";

        UniqueCharacter checker=new UniqueCharacter();
        if(checker.hasUniqueCharacters(string))
        {
            System.out.println(" "+string+" " +" has unique characters");
        }
        else {
            System.out.println(" "+string+" "+" does not have unique characters");
        }



    }



}
