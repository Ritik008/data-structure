public class ReverseSingleLinkedList {
    private static Node head;
    public static void main(String args[]) {
        ReverseSingleLinkedList list = new ReverseSingleLinkedList();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.printList(head);
        Node reverseHead = list.reverseLinkedList(head);
        list.printList(reverseHead);
    }
    
    private static class Node {
        public int value;
        public Node next;
    }
    public void insertAtLast(int value) {
        Node node = new Node();
        node.value = value;
        if(head == null) {
            head = node;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.format("%d -> ",temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}