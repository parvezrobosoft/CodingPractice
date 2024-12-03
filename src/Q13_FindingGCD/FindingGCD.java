package Q13_FindingGCD;


public class FindingGCD {
    public static void main(String[] args) {
        int a = 142;
        int b = 75;

        GCD gcd=new GCD();

        System.out.println("GCD("+a+","+b+") = " + gcd.gcd(b, a));
    }
    }
