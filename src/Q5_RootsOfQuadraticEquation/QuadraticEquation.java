package Q5_RootsOfQuadraticEquation;

public class QuadraticEquation {

    public void getRootsOfQuadraticEquation(int a,int b , int c)
    {

        double determinant;
        double real;
        double imaginary;
        double root1;
        double root2;


        determinant=(b*b)-4*a*c;

        if(determinant>=0)
        {
            real= (double) -b  /2*a;

            imaginary=Math.sqrt(determinant)/2*a;
            System.out.print("Roots are ");
            root1=real+imaginary;
            root2=real-imaginary;

            if(determinant==0)
                System.out.println(root1);

            else
                System.out.println(root1+" and "+root2);

        }
        else
        {
            real= (double) -b/2*a;
            imaginary=Math.sqrt(-determinant)/2*a;
            System.out.print("Roots are ");

            System.out.println(real+" + "+imaginary+"i"+" and "+real+" - "+imaginary+"i");
        }


    }

}
