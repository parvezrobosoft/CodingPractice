package Q80_QueueUsingArray;

public class QueueUsingArray {

    public static void main(String[] args) {

        int totalArraySize=5;

        ArrayQueue queue = new ArrayQueue(totalArraySize);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();

        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Dequeued: " + queue.dequeue());


        queue.display();
    }
}
