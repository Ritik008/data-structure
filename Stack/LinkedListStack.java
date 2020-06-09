public class LinkedListStack {
    public static Node top;
    public static void main(String[] args) {
        LinkedListStack lls = new LinkedListStack();
        lls.push(10);
        lls.push(20);
        lls.push(30);
        lls.push(40);
        lls.push(50);

        lls.pop();
        lls.pop();
        lls.pop();
        lls.pop();
        lls.pop();
        lls.pop();
    }
    public class Node {
        int data;
        Node next;
    }
    public Node push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        return top;
    }
    public Node pop() {
        if(top == null) {
            System.out.println("Stack is empty bro");
            return null;
        }
        Node n = top;
        System.out.println(n.data);
        top = top.next;
        return top;
    }
}