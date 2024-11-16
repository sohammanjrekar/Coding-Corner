
// import java.util.*;

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

// public class DetectStartOfloop {
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

//     public int detectLoop() {
//         // hashing : O(n+ logn)
//         // Map<Node, Integer> hm = new HashMap<>();
//         // Node temp = head;
//         // while (temp != null) {
//         //     if (hm.containsKey(temp)) {
//         //         return temp;
//         //     } else {
//         //         hm.put(temp, 1);
//         //         temp = temp.next;
//         //     }
//         // }
//         // return -1;

//         //tortoise and hare
//         Node slow = head;
//         Node fast = head;

//         // Detect if there is a loop
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 // Loop detected, now find the start of the loop
//                 Node start = head;
//                 while (start != slow) {
//                     start = start.next;
//                     slow = slow.next;
//                 }
//                 return start.data; // Start of the loop
//             }
//         }

//         // No loop detected
//         return -1;
//     }

//     public static void main(String[] args) {
//         DetectStartOfloop ll = new DetectStartOfloop();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(5);
//         ll.insert(6);
//         ll.insert(7);

//         // // Creating a loop for testing: 5 -> 3
//         Node temp = ll.head;
//         while (temp.data != 3) {
//             temp = temp.next;
//         }
//         ll.tail.next = temp; // Creating the loop

//         int hasLoop = ll.detectLoop();
//         System.out.println("Loop detected: " + hasLoop);
//     }
// }
