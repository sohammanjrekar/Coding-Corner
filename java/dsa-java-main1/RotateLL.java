class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class RotateLL {
    Node head;
    Node tail;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
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
  
    public static void main(String[] args) {
        RotateLL ll = new RotateLL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);

        System.out.println("Original List:");
        ll.print();
ll.rotate(2);
        ll.print();
    }
    private void rotate(int k) {
        if (head == null || k == 0) {
            return; // No rotation needed
        }

        Node temp = head;
        int len = 1;

        // Find the length of the linked list
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // Connect the tail to the head to make it circular
        temp.next = head;

        // Find the node just before the new head after rotation
        k = k % len; // In case k is greater than the length of the list
        int skipLength = len - k;

        temp = head;
        for (int i = 1; i < skipLength; i++) {
            temp = temp.next;
        }

        // Make the node next to 'temp' the new head
        head = temp.next;

        // Break the circular connection
        temp.next = null;
    }
}
