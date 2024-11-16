package LinkedList1;
class Node {
    int data; // The data stored in the node
    Node next; // The reference to the next node in the list

    // Constructor to initialize the node with data and next reference
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor to initialize the node with data and no next reference
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mylinkedlist {
    Node head; // The head (first node) of the linked list
    Node tail; // The tail (last node) of the linked list

    // Insert a new node with the given data at the head of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        print();
    }

    // Insert a new node with the given data at the tail of the list
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        print();
    }

    // Insert a new node with the given data at the specified position in the list
    public void insertAtPosition(int data, int pos) {
        if (pos < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            print();
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        print();
    }

    // Insert a new node with the given data before the node with the specified
    // value
    public void insertAtValue(int data, int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node newNode = new Node(data);
        if (head.data == value) {
            newNode.next = head;
            head = newNode;
            print();
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                newNode.next = temp.next;
                temp.next = newNode;
                print();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found in the list.");
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Return the length of the linked list
    public int lengthOfll() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search for a node with the given data in the linked list
    public void searchll(int data) {
        Node temp = head;
        boolean present = false;
        while (temp != null) {
            if (temp.data == data) {
                present = true;
                break;
            }
            temp = temp.next;
        }
        if (present) {
            System.out.println("Number present in linked list.");
        } else {
            System.out.println("Number not present.");
        }
    }

    // Delete the head node of the linked list
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("Nothing to delete.");
            return;
        }
        head = head.next;
        print();
    }

    // Delete the tail node of the linked list
    public void deleteAtTail() {
        if (head == null) {
            System.out.println("Nothing to delete.");
            return;
        }
        if (head == tail) { // Only one element
            head = null;
            tail = null;
            print();
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        print();
    }

    // Delete the node with the given value from the linked list
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == value) {
            deleteAtHead();
            return;
        }
        if (tail.data == value) {
            deleteAtTail();
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                temp.next = temp.next.next;
                print();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found in the list.");
    }

    // Delete the node at the specified position in the linked list
    public void deleteByPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        print();
    }

    public static void main(String[] args) {
        mylinkedlist ll = new mylinkedlist();
        ll.insertAtHead(10); // Insert 10 at the head
        ll.insertAtHead(5); // Insert 5 at the head
        ll.insertAtTail(20); // Insert 20 at the tail
        System.out.println("Length of linked list: " + ll.lengthOfll()); // Print the length of the list
        ll.searchll(5); // Search for the value 5
        ll.insertAtPosition(50, 2); // Insert 50 at position 2
        ll.insertAtValue(100, 50); // Insert 100 before the node with value 50
        ll.deleteAtHead(); // Delete the head node
        ll.deleteAtTail(); // Delete the tail node
        ll.deleteByValue(100); // Delete the node with value 100
    }
}
