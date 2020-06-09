public class SwapTwoNode {
    public static Node head;
    public static void main(String[] args) {
        SwapTwoNode list = new SwapTwoNode();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        list.search(10, 40);
        list.printLinkedList();    
    }

    public class Node {
        int data;
        Node next;
    }
    public void insertLast(int data) {
        Node current = head;
        Node node = new Node();
        node.data = data;

        if(current == null) {
            head = node;
            return;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void printLinkedList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void search(int data1, int data2) {
        Node current, prev;
        current = head;
        prev = null;
        while(current != null && current.data != data1) {
            prev = current;
            current = current.next;
        }
        Node currentData1 = current;
        Node previousData1 = prev;


        current = head;
        prev = null;
        while(current != null && current.data != data2) {
            prev = current;
            current = current.next;
        }
        Node currentData2 = current;
        Node previousData2 = prev; 
        
        Node temp;
        temp = currentData2.next;
        currentData2.next = currentData1.next;
        currentData1.next = temp;

        if(previousData1 == null) {
            currentData1 = head;
            previousData2.next = currentData1;
        }
        if(previousData2 == null) {
            currentData1 = head;
            previousData1.next = previousData2;
        }
    }
}