import java.util.LinkedList;
import java.util.Queue;
public class StackWithTwoQueues {
    public static void main(String[] args) {
        StackWithTwoQueues stack = new StackWithTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();

    public void push(int element) {
        if(queue1.size() == 0) {
            queue1.add(element);
        }else {
            int sizeOfQueue1 = queue1.size();
            for(int i = 0; i < sizeOfQueue1; i++) {
                queue2.add(queue1.remove());
            }
            queue1.add(element);

            for(int i = 0; i < sizeOfQueue1; i++) {
                queue1.add(queue2.remove());
            }
        }
    }
    public int pop() {
        if(queue1.size() == 0) {
            System.out.println("Unflow Exception");
            return -1;
        }
        return queue1.remove();
    }

}