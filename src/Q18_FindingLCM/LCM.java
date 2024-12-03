package Q18_FindingLCM;

import Q13_FindingGCD.GCD;

public class LCM {


    public int lcm(int u, int v)
    {
        GCD gcd=new GCD();

        return (u  * v/ gcd.gcd(u, v));
    }
}
