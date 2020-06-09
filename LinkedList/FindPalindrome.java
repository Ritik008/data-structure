public class FindPalindrome {
    public static Node head;
    public static void main(String[] args) {
        FindPalindrome list = new FindPalindrome();
        list.insertAtLast(1);       
        list.insertAtLast(2);  
        list.printNodes(head);
        System.out.println(list.findPalindrome(head));
    }

    public static class Node {
        int value;
        Node next;
    }

    public void insertAtLast(int value) {
        Node current = head;
        Node node = new Node();
        node.value = value;
        if(current == null) {
            head = node;
        }else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = node; 
        }
    }

    public void printNodes(Node head) {
        Node current = head;
        while(current != null) {
            System.out.format("%d -> ", current.value);
            current = current.next;
        }
        System.out.println();
    }

    public Node middleNode(Node head) {
        Node fast, slow;
        fast = slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverseLinkedList(Node head) {
        Node current = head;
        Node next;
        Node prev = null; 
            while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
    }

    public boolean findPalindrome(Node head) {
        Node middleNode = middleNode(head);
        Node secondHead = middleNode;
        middleNode = null;
        Node reverseSecondHead = reverseLinkedList(secondHead);
        while(head != null && reverseSecondHead != null) {
            if(head.value == reverseSecondHead.value) {
                head = head.next;
                reverseSecondHead = reverseSecondHead.next;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}