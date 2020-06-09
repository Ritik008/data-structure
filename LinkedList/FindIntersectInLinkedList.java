public class FindIntersectInLinkedList {
    public static Node head;
    public static void main(String[] args) {
        FindIntersectInLinkedList list = new FindIntersectInLinkedList();
        Node head1 = new Node(0);
        Node commonNode = new Node(7);
        list.addAtLast(new Node(1), head1);
        list.addAtLast(new Node(2), head1);
        list.addAtLast(commonNode, head1);
        list.addAtLast(new Node(3), head1);
        list.addAtLast(new Node(4), head1);
        
        list.printNodes(head1);
        
        Node head2 = new Node(0);
        list.addAtLast(new Node(3), head2);
        list.addAtLast(new Node(4), head2);
        list.addAtLast(new Node(5), head2);
        list.addAtLast(commonNode, head2);
        list.addAtLast(new Node(6), head2);
        
        list.printNodes(head2);
        
        Node intersectionNode = list.findIntersectionNode(head1, head2);
        System.out.println(intersectionNode.value);
    }

    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public Node addAtLast(Node node, Node head) {
        Node current = head;
        if(current == null) {
            head = node;
        }else {
            while(current.next != null) {
                current = current.next;            
            }
            current.next = node;
        }
        return node;
    }

    public Node findIntersectionNode(Node list1, Node list2) {
        int lengthOfList1 = 0;
        int lengthOfList2 = 0;
        Node ptr1 = list1;
        Node ptr2 = list2;
        while(list1 != null) {
            lengthOfList1++;
            list1 = list1.next;
        }
        while(list2 != null) {
            lengthOfList2++;
            list2 = list2.next;
        }

        if(lengthOfList1 > lengthOfList2) {
            int difference = lengthOfList1 - lengthOfList2;
            int i = 0;
            while(i < difference) {
                ptr1 = ptr1.next;
                i++;
            }
        }else {
            int difference = lengthOfList2 - lengthOfList1;
            int i = 0;
            while(i < difference) {
                ptr2 = ptr2.next;
                i++;
            }
        }
        while(ptr1 != null && ptr2 != null) {
            if(ptr1 == ptr2) {
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }

    public void printNodes(Node head) {
        Node current = head;
        while(current != null) {
            System.out.format("%d -> ",current.value);
            current = current.next;
        }
        System.out.println();
    }
}