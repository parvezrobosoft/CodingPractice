package Q77_StackUsingArray;

public class ArrayStack {


        private int size;
        private int top;
        private int value;
        private  int[] stack;


        ArrayStack (int N) {
            this.size = N;
            this.stack = new int[size];
            this.top = -1;
        }

        public void push(int value)
        {
            if(top +1==size)
            {
                System.out.println("Stack 1 full");
            }
            else
            {
                top++;
                stack[top]= value;
            }
        }
        public int pop()
        {
            if(top ==-1)
            {
                System.out.println("Stack 1 empty");
                return 0;
            }
            else
            {
                value=stack[top];
                top--;
                return value;
            }
        }

}
