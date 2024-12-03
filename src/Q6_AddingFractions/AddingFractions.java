package Q6_AddingFractions;

public class AddingFractions {

    public static void main(String[] args) {


        Fraction a =new Fraction(3,5);
        Fraction b =new Fraction(4,15);
        Fraction result ;

        FractionOperator add =new FractionOperator();

        result=add.addFractions(a,b);
        System.out.println(a+" + "+b+" = "+result);


    }
}
