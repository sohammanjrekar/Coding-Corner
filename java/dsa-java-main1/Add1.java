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

// public class Add1 {
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

//     public void add() {
//         Node reversedHead = reverse(head);
//         Node temp = reversedHead;
//         int carry = 1;
//         while (temp != null) {
//             int sum = temp.data + carry;
//             if (sum < 10) {
//                 temp.data = sum;
//                 carry = 0;
//                 break;
//             } else {
//                 temp.data = sum % 10;
//                 carry = sum / 10;

//             }
//             temp = temp.next;
//         }
//         if (carry == 1) {
//             temp = reversedHead;
//             Node newNode = new Node(1);

//             // Traverse to the end of the reversed list
//             while (temp.next != null) {
//                 temp = temp.next;
//             }

//             // Append the new node
//             temp.next = newNode;
//         }

//         // Reverse the list back to original order
//         head = reverse(reversedHead);
//     }

//     public static void main(String[] args) {
//         Add1 ll = new Add1();
//         ll.insert(1);
//         ll.insert(2);
//         ll.print();
//         ll.add();
//         ll.print();
//     }
// }
