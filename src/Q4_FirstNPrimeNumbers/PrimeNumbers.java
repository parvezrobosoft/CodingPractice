package Q4_FirstNPrimeNumbers;

public class PrimeNumbers {


    public  void getPrimeNumbers(int total)
    {
        int primeFlag;
        System.out.println("First"+total+"Prime Numbers are : ");

        int num =0;
        int i=2;
        int j;
        while(num<total)
        {

            while (i>=2) {
                primeFlag=0;
                for ( j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeFlag = 1;
                        i++;
                        break;
                    }
                }

                if (primeFlag == 0) {
                    System.out.print(j + " ");
                    i++;
                    break;
                }
            }
            num++;
        }
    }


    public  void getPrimeNumbers(int from,int to)
    {
        int primeFlag;
        System.out.println("Prime Numbers from "+from+" to "+to+" are ");


        int i=from;
        int j;


            while (i<to) {
                primeFlag=0;
                for ( j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeFlag = 1;
                        i++;
                        break;
                    }
                }

                if (primeFlag == 0) {
                    System.out.print(j + " ");
                    i++;
                }
            }


    }

}
