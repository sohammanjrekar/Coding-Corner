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

// public class FindMid {
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

//     public int mid() {
//         // Node temp=head;
//         // int len=0;
//         // while (temp!=null) {
//         //     len++;
//         //     temp=temp.next;
//         // }
//         // temp=head;
//         // for (int i = 1; i < (len/2)+1; i++) {
//         //     temp=temp.next;
//         // }
//         // return temp.data;


//         // tortoise and hare
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow.data; // slow is now pointing to the middle node
//     }

//     public static void main(String[] args) {
//         FindMid ll = new FindMid();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(5);
//         ll.insert(6);
//         ll.print();
//         System.out.println(ll.mid());
//     }
// }
