public class RotateAList {
    public static Node head = null;
    public static void main(String[] args) {
        RotateAList list = new RotateAList();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.printList(head);
        Node add = list.rotateList(head, 2000000000);
        list.printList(add);
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
    
    public void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.format("%d -> ",temp.value);
            temp = temp.next;
        }
        System.out.println();
    }   
    public Node rotateList(Node head, int k) {
        Node prev, current;
        current = head;
        prev = null;
        int count = 0;
        while(current != null)  {
            current = current.next;
            count++;
        }
        int n = k > count ? (k % count) : k;
        current = head;
        for(int i = 0; i < n; i++) {

            while(current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            current.next = head;
            head = current;

        }
        return current;
    }
}