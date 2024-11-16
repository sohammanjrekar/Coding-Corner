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

// public class Palindrome {
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

//     public Node reverse(Node head) {
//         Node prev = null;
//         Node curr = head;
//         Node next = null;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev; // New head of reversed list
//     }

//     public boolean checkPalindrome() {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         Node secondHalf = reverse(slow);
//         Node firstHalf = head;

//         while (secondHalf != null) {
//             if (firstHalf.data != secondHalf.data) {
//                 return false;
//             }
//             firstHalf = firstHalf.next;
//             secondHalf = secondHalf.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Palindrome ll = new Palindrome();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(2);
//         ll.insert(1);

//         ll.print();
//         System.out.println("Is palindrome: " + ll.checkPalindrome()); // Should print true

//         ll.insert(4);
//         ll.print();
//         System.out.println("Is palindrome: " + ll.checkPalindrome()); // Should print false
//     }
// }
