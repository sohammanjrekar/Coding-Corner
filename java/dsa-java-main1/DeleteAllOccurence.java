// class Node {
//     int data;
//     Node next;
//     Node previous;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//         this.previous = null;
//     }

//     Node(int data, Node next, Node previous) {
//         this.data = data;
//         this.next = next;
//         this.previous = previous;
//     }
// }

// public class DeleteAllOccurence {
//     Node head;
//     Node tail;

//     public void insert(int value) {
//         Node newNode = new Node(value);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             newNode.previous = tail;
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

//     public void deleteOccur(int key) {
//         // Handle case where the head node needs to be deleted
//         while (head != null && head.data == key) {
//             head = head.next;
//             if (head != null) {
//                 head.previous = null;
//             }
//         }
    
//         // Handle deletion of nodes other than the head
//         Node temp = head;
//         while (temp != null) {
//             if (temp.data == key) {
//                 // Remove the node from the list
//                 if (temp.previous != null) {
//                     temp.previous.next = temp.next;
//                 }
//                 if (temp.next != null) {
//                     temp.next.previous = temp.previous;
//                 }
//                 if (temp == tail) {
//                     tail = temp.previous;
//                 }
//             }
//             temp = temp.next;
//         }
//     }
    

//     public static void main(String[] args) {
//         DeleteAllOccurence ll = new DeleteAllOccurence();
//         ll.insert(3);
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(3);

//         ll.print();
//         ll.deleteOccur(3);
//         ll.print();

//     }
// }