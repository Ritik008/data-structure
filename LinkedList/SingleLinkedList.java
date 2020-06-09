public class SingleLinkedList {
    public static void main(String args[]) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);
        list.printLinkedList();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.printLinkedList();
    }
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertLast(int data) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node node = new Node();
        node.data = data;
        current.next = node;
    }

    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }


    public void printLinkedList() {
        Node current = head;
        while(current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    public int data;
    public Node next;

    public void displayNodeData() {
        System.out.print(data+" -> ");
    }
}