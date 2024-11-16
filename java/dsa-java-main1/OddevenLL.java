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

// public class OddevenLL {
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

//     public void oddeven() {
//         if (head == null || head.next == null) {
//             return;
//         }

//         Node temp = head;
//         Node odd = new Node(-1); // Dummy node for odd list
//         Node even = new Node(-1); // Dummy node for even list
//         Node oddTemp = odd;
//         Node evenTemp = even;

//         int count = 1;

//         while (temp != null) {
//             if (count % 2 == 0) {
//                 evenTemp.next = temp;
//                 evenTemp = evenTemp.next;
//             } else {
//                 oddTemp.next = temp;
//                 oddTemp = oddTemp.next;
//             }
//             temp = temp.next;
//             count++;
//         }

//         evenTemp.next = null; // End the even list
//         oddTemp.next = even.next; // Connect odd list to even list
//         head = odd.next; // New head of the rearranged list
//     }

//     public static void main(String[] args) {
//         OddevenLL ll = new OddevenLL();
//         ll.insert(1);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(2);
//         ll.insert(5);
//         ll.insert(6);

//         ll.print();
//         ll.oddeven();
//         ll.print();
//     }
// }
