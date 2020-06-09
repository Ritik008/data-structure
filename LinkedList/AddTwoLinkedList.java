public class AddTwoLinkedList {
    public static Node head;
    public static void main(String[] args) {
        AddTwoLinkedList list = new AddTwoLinkedList();
        System.out.println("=======LinkedList1=======");
        Node head1 = new Node();
        head1.value = 1;
        list.insertAtLast(2, head1);
        list.insertAtLast(3, head1);
        list.insertAtLast(4, head1);
        list.insertAtLast(5, head1);
        list.printNodes(head1);
        System.out.println("======LinkedList2=====");
        Node head2 = new Node();
        head2.value = 2;
        list.insertAtLast(3, head2);
        list.insertAtLast(4, head2);
        list.insertAtLast(5, head2);
        list.insertAtLast(6, head2);
        list.printNodes(head2);

        Node l1 = list.reverseList(head1);
        Node l2 = list.reverseList(head2);

        Node sumHead = list.addLinkedList(l1, l2);
        Node sum = list.reverseList(sumHead);
        list.printNodes(sum);        
        
        
        

    }
    public static class Node {
        int value;
        Node next;
    }
    public void insertAtLast(int value, Node head) {
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

    public Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node next;
        if (current == null || current.next == null) {
			return current;
		}
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node addLinkedList(Node l1, Node l2) {
        int carry = 0;
        Node newHead = null;
        Node tempNodeForIteration = null;
        int sum = 0;
        int firstIter = 0;

        while(l1 != null || l2 != null) {
            firstIter++;
            sum = carry;
            if(l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            sum = sum % 10;

            if(firstIter == 1) {
                tempNodeForIteration = new Node();
                tempNodeForIteration.value = sum;
                newHead = tempNodeForIteration;
            }else {
                Node tempSumNode = new Node();
                tempSumNode.value = sum;
                tempNodeForIteration.next = tempSumNode;
                tempNodeForIteration = tempNodeForIteration.next;
            }
        }
        if(carry != 0) {
            Node tempNode = new Node();
            tempNode.value = carry;
            tempNodeForIteration.next = tempNode;
        }
        return newHead;
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