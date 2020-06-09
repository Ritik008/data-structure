public class FindMiddleNode {
    private static Node head;
    public static void main(String args[]) {
        FindMiddleNode list = new FindMiddleNode();
        list.addToTheLast(10);
        list.addToTheLast(20);
        list.addToTheLast(30);
        list.addToTheLast(40);
        list.addToTheLast(50);
        list.addToTheLast(60);
        Node middle = list.findMiddle(head);
        System.out.println("Middle node of the list is "+middle.value);
        list.printNode(head);
    }
    public static class Node {
        private int value;
        private Node next;
    }
    public void addToTheLast(int value) {
        Node current = head;
        Node node = new Node();
        node.value = value;
        if(head == null) {
            head = node;
        }else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;

        }
    }
    public Node findMiddle(Node head) {
        Node slow,fast;
        slow = fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node printNode(Node head) {
        Node current = head;
       while(current!= null) {
        System.out.format("%d -> ",current.value);
        current = current.next;
       }
       System.out.println();
       return head;
    }
}