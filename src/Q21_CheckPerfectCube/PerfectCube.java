package Q21_CheckPerfectCube;

public class PerfectCube {
    public boolean isPerfectCube(int num) {


        int cubeRoot = (int) Math.cbrt(num);
        System.out.println(cubeRoot);

        return (num==Math.pow(cubeRoot,3));
    }
}
