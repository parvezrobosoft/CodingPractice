package Q16_ConvertTime;

public class TimeConverter {

    public static void convertSeconds(int inputSeconds) {

        int temp=inputSeconds;
        int hours = inputSeconds / 3600;
        inputSeconds=inputSeconds % 3600;
        int minutes = inputSeconds / 60;
        int seconds = inputSeconds % 60;

        System.out.print(temp + " seconds = ");


        System.out.print(hours + " hour" );
        if(hours>1)
            System.out.print("s");

        System.out.print(" "+minutes + " minute" );
        if(minutes>1)
            System.out.print("s");

        System.out.print(" "+seconds + " second" );
        if(seconds>1)
            System.out.print("s");

        System.out.println();


    }

}
