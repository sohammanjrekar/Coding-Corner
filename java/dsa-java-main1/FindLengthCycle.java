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

// public class FindLengthCycle {
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
//         int index = 0;
//         // Map<Node, Integer> hm = new HashMap<>();
//         // Node temp = head;
//         // while (temp != null) {
//         //     if (hm.containsKey(temp)) {
//         //         return index - hm.get(temp);
//         //     }
//         //     hm.put(temp, index);
//         //     index++;
//         //     temp = temp.next;
//         // }
//         // return -1; // No cycle detected

//         //tortoise and hare
//         Node slow=head;
//         Node fast=head;
//         while (fast != null && fast.next != null) {

//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast) return findlen(slow);
//         }
//             return -1;
//     }


//     private int findlen(Node slow) {
//         Node temp = slow;
//         int length = 0;

//         do {
//             temp = temp.next;
//             length++;
//         } while (temp != slow);

//         return length;
//     }

//     public static void main(String[] args) {
//         FindLengthCycle ll = new FindLengthCycle();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(5);
//         ll.insert(6);
//         ll.insert(7);

//         // Creating a loop for testing: 7 -> 3
//         Node temp = ll.head;
//         while (temp.data != 3) {
//             temp = temp.next;
//         }
//         ll.tail.next = temp; // Creating the loop

//         int cycleLength = ll.detectLoop();
//         if (cycleLength != -1) {
//             System.out.println("Cycle detected with length: " + cycleLength);
//         } else {
//             System.out.println("No cycle detected.");
//         }
//     }
// }
