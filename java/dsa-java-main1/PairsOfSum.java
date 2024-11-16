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

// public class PairsOfSum {
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

    

//     public static void main(String[] args) {
//         PairsOfSum ll = new PairsOfSum();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);
//         ll.insert(9);
//         ll.print();
//         ll.findpairs(5);
//     }

//     private void findpairs(int sum) {
//         // give sorted linked list
//         // Node temp1=head;
//         // while (temp1!=null) {
//         //     Node temp2=temp1.next;
//         //     while (temp2!=null) {
//         //         if((temp1.data+temp2.data)>sum) break;
//         //         if((temp1.data+temp2.data)==sum){

//         //             System.out.println(temp1.data+" , "+temp2.data);
//         //         }
//         //         temp2=temp2.next;
//         //     }
//         //     temp1=temp1.next;
//         // }


//  // Given that the list is sorted
//  if (head == null || head.next == null) {
//     System.out.println("List is too short to find pairs.");
//     return;
// }

// Node left = head;
// Node right = tail;

// while (left != null && right != null && left != right && left.previous != right) {
//     int currentSum = left.data + right.data;
//     if (currentSum == sum) {
//         System.out.println(left.data + " , " + right.data);
//         left = left.next;
//         right = right.previous;
//     } else if (currentSum < sum) {
//         left = left.next;
//     } else {
//         right = right.previous;
//     }
// }


//     }
// }