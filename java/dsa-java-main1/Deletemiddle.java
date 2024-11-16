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

// public class Deletemiddle {
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

//     public void middelete() {
//         // if (head == null) {
//         //     return;
//         // }
        
//         // // Calculate the length of the linked list
//         // Node temp = head;
//         // int length = 0;
//         // while (temp != null) {
//         //     length++;
//         //     temp = temp.next;
//         // }

//         // // Find the position of the middle node
//         // int midPos = length / 2;

//         // // If there is only one element in the list
//         // if (midPos == 0) {
//         //     head = head.next;
//         //     return;
//         // }

//         // // Navigate to the node just before the middle node
//         // temp = head;
//         // for (int i = 1; i < midPos; i++) {
//         //     temp = temp.next;
//         // }

//         // // Delete the middle node
//         // if (temp.next != null) {
//         //     temp.next = temp.next.next;
//         // }



//         Node slow=head;
//         Node fast=head;
//         int skip=1;
//         while (fast!=null&&fast.next!=null) {
// if(skip==0){
//     slow=slow.next;
// }
//             fast=fast.next.next;skip=0;
//         }

//         slow.next=slow.next.next;
//           // If deleting the head node, update the head
//         if (slow == head) {
//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {
//         Deletemiddle ll = new Deletemiddle();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(5);
//         ll.insert(6);
//         ll.print();
//         ll.middelete();
//         ll.print();
//     }
// }
