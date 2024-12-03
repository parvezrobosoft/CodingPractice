package Q9_PowerOfANumber;

public class PowerOf {

    public long getPowerOf(int base,int exponent)
    {
        long power;
        power=1;

        for(int i=0;i<exponent;i++)
        {
            power=power*base;
        }
        return power;
    }
}
