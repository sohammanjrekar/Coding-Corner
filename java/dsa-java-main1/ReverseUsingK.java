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

public class ReverseUsingK {
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
    public void reverseInChunks(int k) {
        if (head == null || k <= 1) {
            return; // No need to reverse if the list is empty or k is less than 1
        }

        head = reverseInChunks(head, k);
    }

    private Node reverseInChunks(Node head, int k) {
        // Initialize pointers to keep track of the current node, previous chunk's tail, and new head of the list
        Node current = head;
        Node prevTail = null;
        Node newHead = null;
    
        // Loop until all nodes are processed
        while (current != null) {
            Node prev = null;        // Previous node in the current chunk
            Node chunkHead = current; // The current chunk's original head
            int count = 0;           // Counter to ensure only 'k' nodes are processed in one chunk
    
            // Reverse 'k' nodes
            while (current != null && count < k) {
                Node next = current.next; // Store the next node
                current.next = prev;      // Reverse the current node's pointer
                prev = current;           // Move the previous node pointer forward
                current = next;           // Move to the next node
                count++;
            }
    
            // 'prev' is now the new head of the reversed chunk
            if (newHead == null) {
                newHead = prev; // Set the new head for the first chunk
            }
    
            // Connect the previous chunk's tail to the current chunk's head
            if (prevTail != null) {
                prevTail.next = prev; // Link the last node of the previous chunk to the first node of the current chunk
            }
    
            // The tail of the current chunk is now 'chunkHead'
            prevTail = chunkHead; // Update the tail for the next chunk connection
        }
    
        return newHead; // Return the new head of the fully reversed list in chunks
    }
    

    public static void main(String[] args) {
        ReverseUsingK ll = new ReverseUsingK();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);

        System.out.println("Original List:");
        ll.print();

        ll.reverseInChunks(3);

        System.out.println("Reversed List in chunks of 3:");
        ll.print();
    }
}
