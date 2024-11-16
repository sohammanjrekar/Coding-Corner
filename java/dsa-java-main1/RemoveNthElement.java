// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }

//     Node(int data, Node next) {
//         this.data = data;
//         this.next = next;
//     }
// }

// public class RemoveNthElement {
//     Node head;
//     Node tail;

//     public void insert(int value) {
//         Node newNode = new Node(value);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void remove(int pos) {
//         // Calculate the length of the linked list
//         Node temp = head;
//         int len = 0;
//         while (temp != null) {
//             len++;
//             temp = temp.next;
//         }

//         // Edge case: if pos is greater than or equal to the length of the list
//         if (pos >= len) {
//             System.out.println("Position is greater than or equal to the length of the list");
//             return;
//         }

//         // Initialize pointers
//         temp = head;
//         Node prev = null;
//         int count = 0;

//         // Traverse the list to find the node to remove
//         while (temp != null) {
//             if (count == len - pos - 1) { // Find the node just before the one to be removed
//                 if (temp.next != null) { // Check if next node exists
//                     temp.next = temp.next.next; // Remove the node
//                 } else {
//                     temp.next = null; // Handle case where node to remove is the last node
//                 }
//                 break;
//             }
//             prev = temp;
//             temp = temp.next;
//             count++;
//         }

//         // Handle the case where we need to remove the head node
//         if (pos == len - 1) {
//             head = head.next;
//         }
//     }

//     public void removenth(int pos) {
//         // Handle edge case when the list is empty
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
        
//         // Create a dummy node to handle edge cases like removing the head node
//         Node dummy = new Node(0);
//         dummy.next = head;
//         Node first = dummy;
//         Node second = dummy;
        
//         // Move `first` pointer `pos + 1` steps ahead
//         for (int i = 1; i <= pos; i++) {
//             if (first.next == null) {
//                 // If `pos` is greater than the length of the list
//                 System.out.println("Position is out of bounds.");
//                 return;
//             }
//             first = first.next;
//         }
        
//         // Move both `first` and `second` pointers until `first` reaches the end
//         while (first.next != null) {
//             first = first.next;
//             second = second.next;
//         }
        
//         // `second` is now pointing to the node before the node to be removed
//         second.next = second.next.next;
        
//         // Update head in case the node to be removed was the head node
//         head = dummy.next;
//     }
    
    
    

//     public static void main(String[] args) {
//         RemoveNthElement ll = new RemoveNthElement();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(5);
//         ll.insert(6);
//         ll.insert(7);

//         ll.print();
//         // ll.remove(2);
//         // ll.print();
//         ll.removenth(2);
//         ll.print();

//     }
// }
