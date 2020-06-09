public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        System.out.println(queue.deQueue());
        queue.enQueue(30);
        System.out.println(queue.deQueue());
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());


    }

    int front = -1;
    int rear = -1;
    int Q[];
    int size;
    public CircularQueue(int size) {
        this.size = size;
        Q = new int[size];        
        System.out.println("Your queue has been created with size "+this.size);
    }

    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue overflow");
            return;
        }else if(isEmpty()) {
            rear = front = 0;
            Q[rear] = value;
        }else {
            rear = (rear + 1) % size;
            Q[rear] = value;   
        }
    }

    public int deQueue() {
        int data = Q[front];
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }else if(front == rear) {
            front = rear = -1;
            return data;

        }else {

            front = ((front+1) % size);
            return data;
        }   
    }

    public boolean isFull() {
        if((rear + 1) % size == front) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(rear == -1 && front == -1) {
            return true;
        }
        return false;
    }

  
}