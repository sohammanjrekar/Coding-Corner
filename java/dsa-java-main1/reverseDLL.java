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

// public class reverseDLL {
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

//     public void reverse() {
//         Node curr = head;
//         Node temp = null;
//         while (curr != null) {
//             temp = curr.previous;
//             curr.previous = curr.next;
//             curr.next = temp;
//             curr = curr.previous;
//         }
//         if (temp != null) {
//             temp = tail;
//             tail = head;
//             head = temp.previous;
//         }

//     }

//     public static void main(String[] args) {
//         reverseDLL ll = new reverseDLL();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);

//         ll.print();
//         ll.reverse();
//         ll.print();

//     }
// }