public class CustomStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(6);
        stack.push(50);
        stack.push(2);
        stack.push(5);
        stack.push(23);
        
        CustomStack temp = stack.sortedTheStack(stack);
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
    }

    int size;
    int arr[];
    int top;

    CustomStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if(!this.isFull()) {
            top++;
            arr[top] = element;
        }else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if(!this.isEmpty()) {
            int poppedElement = top;
            top--;
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

    public CustomStack sortedTheStack(CustomStack stack) {
        CustomStack tempStack = new CustomStack(5);
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while(!tempStack.isEmpty() && temp < tempStack.peek()) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
}