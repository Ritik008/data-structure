public class StackCustom {
    public static void main(String[] args) {
        StackCustom stack = new StackCustom(5);
        stack.push(10);   
        stack.push(20);   
        stack.push(30);   
        stack.push(40);   
        stack.push(50);
        System.out.println("================================");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("================================");
        System.out.println("Peek: "+stack.peek());
        
    
    }
    int size;
    int arr[];
    int top;

    StackCustom(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if(!isFull()) {
            top++;
            arr[top] = element;
            System.out.printf("Pushed element: %d\n",arr[top]);
        }else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int poppedElement = top;
            top--;
            System.out.printf("Popped element: %d\n",arr[poppedElement]);
            return arr[poppedElement];
        }else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public int peek() {
        if(!this.isEmpty()) {
            return arr[top];
        }else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size-1 == top;
    }
}