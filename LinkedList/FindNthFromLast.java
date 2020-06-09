public class FindNthFromLast {
    public static Node head;
    public static void main(String[] args) {
        FindNthFromLast list = new FindNthFromLast();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);
        list.printNodes();
        Node result = list.findFromLast(2);
        System.out.println(result.value);
    }

    public static class Node {
        public int value;
        public Node next;
    }
    public void insertAtLast(int value) {
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
    public Node findFromLast(int nthNode) {
        Node first, second;
        first = second =  head;
        for(int i = 0; i < nthNode; i++) {
            first = first.next;
        }

        while(first != null) {
            second = second.next;
            first = first.next;
        }
        return second;
    }

    public void printNodes() {
        Node current = head;
        while(current != null) {
            System.out.format("%d -> ",current.value);
            current = current.next;
        } 
        System.out.println();
    }
}