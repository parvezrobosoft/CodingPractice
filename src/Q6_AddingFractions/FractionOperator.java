package Q6_AddingFractions;

import Q13_FindingGCD.GCD;
import Q18_FindingLCM.LCM;

public class FractionOperator
{
    public Fraction addFractions(Fraction num1,Fraction num2)
    {
        Fraction result =new Fraction(1,1);
        LCM getlcm=new LCM();

        int lcm= getlcm.lcm(num1.getDenominator(),num2.getDenominator());

        result.setNumerator((lcm / num1.getDenominator())* num1.getNumerator())  ;
        result.setNumerator(result.getNumerator()+(lcm / num2.getDenominator())* num2.getNumerator());

        result.setDenominator(lcm);

        GCD gcd = new GCD();
        int resultGCD=gcd.gcd(result.getNumerator(), result.getDenominator());

        result.setNumerator(result.getNumerator()/resultGCD);
        result.setDenominator(result.getDenominator()/resultGCD);

        return result;

    }



}
