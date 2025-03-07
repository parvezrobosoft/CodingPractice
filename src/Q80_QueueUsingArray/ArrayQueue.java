package Q80_QueueUsingArray;

public class ArrayQueue {

    int[] queue;
        int front;
        int back;
        int size;
        int capacity;

        public ArrayQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = -1;
            this.back = -1;
            this.size = 0;
        }

        public int getSize() {
            return size;
        }

        public void enqueue(int element) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            back = (back + 1) % capacity;
            queue[back] = element;
            size++;
            System.out.println("Enqueued: " + element);
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int dequeuedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedElement;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
}
