public class FindLoopInLinkedList {
    public static Node head;
    public static void main(String[] args) {
        FindLoopInLinkedList list = new FindLoopInLinkedList();
        Node node = list.insertAtFirst(10, new Node());
        list.insertAtFirst(20, new Node());
        list.insertAtFirst(30, new Node());
        list.insertAtFirst(40, new Node());
        list.insertAtFirst(50, new Node());
        list.insertAtFirst(60, new Node());
        list.printNodes();
        list.insertAtFirst(70, node);
        
        System.out.println(list.findLoop());
    }   

    public static class Node {
        int value;
        Node next;
    }

    public Node insertAtFirst(int value, Node node) {
        node.value = value;
        if(head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
        return node;
    }

    public void printNodes() {
        Node node = head;
        while(node != null) {
            System.out.format("%d -> ",node.value);
            node = node.next;
        }
        System.out.println();
    }
    public boolean findLoop(){
        Node fast, slow;
        fast = slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}