package Q14_FibanocciSeries;

public class FibanocciSeries {
    public static void main(String[] args) {

        int N = 5;
        Fibanocci fibanocci=new Fibanocci();

        if (N<= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            fibanocci.printFibonacci(N);
        }
    }
}
