package LinkedList1;
class Node {
    int data; // The data stored in the node
    Node next; // The reference to the next node in the list
    Node previous; // The reference to the previous node in the list

    // Constructor to initialize the node with data only
    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    // Constructor to initialize the node with data, next reference, and previous reference
    Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}

public class myDoublell {
    Node head; // The head (first node) of the linked list
    Node tail; // The tail (last node) of the linked list

    // Insert a new node with the given data at the head of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newNode; // Set the new node as the head
            tail = newNode; // Set the new node as the tail
        } else {
            newNode.next = head; // Link the new node to the current head
            head.previous = newNode; // Link the current head to the new node
            head = newNode; // Update the head to the new node
        }
        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Print the linked list starting from the head
    public void printFromHead() {
        Node temp = head; // Start from the head
        System.out.print("Head to Tail: ");
        if (temp == null) { // If the list is empty
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Head --> ");
        while (temp != null) { // Traverse the list
            System.out.print(temp.data); // Print the data of the current node
            if (temp.next != null) { // If there is a next node
                System.out.print(" --> "); // Print arrow
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println(" --> Tail");
    }

    // Print the linked list starting from the tail
    public void printFromTail() {
        Node temp = tail; // Start from the tail
        System.out.print("Tail to Head: ");
        if (temp == null) { // If the list is empty
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Tail --> ");
        while (temp != null) { // Traverse the list from tail to head
            System.out.print(temp.data); // Print the data of the current node
            if (temp.previous != null) { // If there is a previous node
                System.out.print(" --> "); // Print arrow
            }
            temp = temp.previous; // Move to the previous node
        }
        System.out.println(" --> Head");
    }

    // Insert a new node with the given data at the tail of the list
    public void insertAtTail(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newNode; // Set the new node as the head
            tail = newNode; // Set the new node as the tail
        } else {
            tail.next = newNode; // Link the current tail to the new node
            newNode.previous = tail; // Link the new node to the current tail
            tail = newNode; // Update the tail to the new node
        }
        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Insert a new node with the given data at the specified position in the list
    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (pos == 0) { // If the position is 0, insert at the head
            insertAtHead(data);
            return;
        }
        Node temp = head; // Start from the head
        for (int i = 1; i < pos - 1; i++) { // Traverse the list to find the position
            if (temp.next == null) { // If the position is greater than the length
                break; // Break the loop
            }
            temp = temp.next; // Move to the next node
        }
        newNode.next = temp.next; // Link the new node to the next node
        if (temp.next != null) { // If there is a next node
            temp.next.previous = newNode; // Link the next node to the new node
        }
        temp.next = newNode; // Link the current node to the new node
        newNode.previous = temp; // Link the new node to the current node
        if (newNode.next == null) { // If the new node is inserted at the end
            tail = newNode; // Update the tail to the new node
        }

        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Delete the node at the head of the list
    public void deleteAtHead() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        head = head.next; // Move the head to the next node
        if (head != null) { // If the new head is not null
            head.previous = null; // Set the previous reference of the new head to null
        } else {
            tail = null; // If the list becomes empty, set the tail to null
        }
        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Delete the node at the tail of the list
    public void deleteAtTail() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        tail = tail.previous; // Move the tail to the previous node
        if (tail != null) { // If the new tail is not null
            tail.next = null; // Set the next reference of the new tail to null
        } else {
            head = null; // If the list becomes empty, set the head to null
        }
        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Delete the first node with the given value in the list
    public void deleteByValue(int value) {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) { // If the value is at the head
            deleteAtHead();
            return;
        }
        if (tail.data == value) { // If the value is at the tail
            deleteAtTail();
            return;
        }
        Node temp = head; // Start from the head
        while (temp != null) { // Traverse the list
            if (temp.data == value) { // If the value is found
                temp.previous.next = temp.next; // Link the previous node to the next node
                if (temp.next != null) { // If there is a next node
                    temp.next.previous = temp.previous; // Link the next node to the previous node
                }
                break; // Break the loop after deleting the node
            }
            temp = temp.next; // Move to the next node
        }
        printFromHead(); // Print the list from the head
        printFromTail(); // Print the list from the tail
    }

    // Return the length of the linked list
    public int lengthOfDll() {
        Node temp = head; // Start from the head
        int count = 0; // Initialize the count to 0
        while (temp != null) { // Traverse the list
            count++; // Increment the count
            temp = temp.next; // Move to the next node
        }
        return count; // Return the count
    }

    // Search for a value in the linked list
    public void searchValue(int value) {
        boolean present = false; // Initialize the present flag to false
        Node temp = head; // Start from the head
        while (temp != null) { // Traverse the list
            if (temp.data == value) { // If the value is found
                present = true; // Set the present flag to true
                break; // Break the loop
            }
            temp = temp.next; // Move to the next node
        }
        if (present) { // If the value is present
            System.out.println("Value is present");
        } else { // If the value is not present
            System.out.println("Value is not present");
        }
    }

    public static void main(String[] args) {
        myDoublell dll = new myDoublell(); // Create a new double linked list
        dll.insertAtHead(10); // Insert 10 at the head
        System.out.println();
        dll.insertAtHead(4); // Insert 4 at the head
        System.out.println();
        dll.insertAtTail(12); // Insert 12 at the tail
        System.out.println();
        dll.insertAtTail(25); // Insert 25 at the tail
        System.out.println();
        dll.insertAtPos(50, 2); // Insert 50 at the second position
        System.out.println();
        dll.deleteAtHead(); // Delete the head node
        System.out.println();
        dll.deleteAtTail(); // Delete the tail node
        System.out.println();
        dll.deleteByValue(10); // Delete the node with value 10
        System.out.println();
        System.out.println("Length of DLL: " + dll.lengthOfDll()); // Print the length of the DLL
        System.out.println();
        dll.searchValue(10); // Search for the value 10
        System.out.println();
        dll.insertAtTail(25); // Insert 25 at the tail
        System.out.println();
        dll.insertAtTail(75); // Insert 75 at the tail
        System.out.println();
        dll.searchValue(12); // Search for the value 12
    }
}


// Time Complexity
// Insert at Head/Tail: O(1) - Constant time operation.
// Insert at Position: O(n) - Linear time operation in the worst case, where n is the length of the list.
// Delete at Head/Tail: O(1) - Constant time operation.
// Delete by Value: O(n) - Linear time operation in the worst case, where n is the length of the list.
// Print from Head/Tail: O(n) - Linear time operation.
// Length of DLL: O(n) - Linear time operation.
// Search Value: O(n) - Linear time operation.


// Space Complexity
// Overall: O(n) - Linear space operation, where n is the number of nodes in the list. Each node requires constant space, and the space complexity scales linearly with the number of nodes.