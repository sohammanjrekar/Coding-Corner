class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}

public class RemoveDuplicate {
    Node head;
    Node tail;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteDuplicates() {
        if (head == null) {
            return; // No nodes to process
        }
    
        Node current = head;
    
        while (current != null && current.next != null) {
            // If the current node's data is equal to the next node's data, remove the next node
            if (current.data == current.next.data) {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.previous = current;
                } else {
                    tail = current; // Update tail if the last node was removed
                }
            } else {
                // Move to the next node only if no duplicate was found
                current = current.next;
            }
        }
    }
    
    

    public static void main(String[] args) {
        RemoveDuplicate ll = new RemoveDuplicate();
        ll.insert(1);
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);

        ll.print();
        ll.deleteDuplicates();
        ll.print();

    }
}