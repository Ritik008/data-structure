public class Queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40); 

        queue.printQueue();

        queue.deQueue();
        queue.deQueue();
        
        queue.printQueue();
    }
    int front = -1;
    int rear = -1;
    int Q[];
    int size;
    public Queue(int size) {
        this.size = size;
        Q = new int[size];        
        System.out.println("Your queue has been created with size "+this.size);
    }

    
    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue Overflow");
            return;
        }else if(isEmpty()) {
            front = 0;
            rear = 0;
            Q[rear] = value;
        }else {
            rear++;
            Q[rear] = value;
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }else if(front == rear) {
            int element = Q[rear];
            rear = front = -1;
            return element;
        }else {
            return Q[front++];
        }
    }

    public boolean isFull() {
        if(rear == size-1) {
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

    public void printQueue() {
        for(int i = front; i < rear; i++) {
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }
}