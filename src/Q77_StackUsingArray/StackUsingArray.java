package Q77_StackUsingArray;

public class StackUsingArray {
    public static void main(String[] args) {

        int N=20;

        ArrayStack stack = new ArrayStack(N);

        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
