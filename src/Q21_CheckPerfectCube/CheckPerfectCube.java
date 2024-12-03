package Q21_CheckPerfectCube;

public class CheckPerfectCube {
    public static void main(String[] args) {

        int number=729;

        PerfectCube perfectCube=new PerfectCube();


        if (perfectCube.isPerfectCube(number)) {
            System.out.println(number + " is a perfect cube.");
        }
        else
        {
            System.out.println(number + " is not a perfect cube.");
        }
    }
}
