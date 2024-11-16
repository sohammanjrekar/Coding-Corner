// import java.util.HashMap;
// import java.util.Map;

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

// public class IntersectionNode {
//     Node head;

//     public void insert(int value) {
//         Node newNode = new Node(value);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
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

//     // Method to find the intersection node of two linked lists
//     public static Node findIntersection(Node head1, Node head2) {
//         //method hashing
// //         Map<Node,Integer>hm=new HashMap<>();
// //         Node temp1=head1;
// //         Node temp2=head2;
// //         while (temp1!=null) {
// //             hm.put(temp1, 1);
// //             temp1=temp1.next;
// //         }
// //         while (temp2!=null) {
// //             if(hm.containsKey(temp2)) return temp2;
// //             temp2=temp2.next;
// //         }
// // return null;


// // optimised
// Node temp1=head1;
// Node temp2=head2;
// int len1=0,len2=0;
// while (temp1!=null) {
//                 len1++;
//                 temp1=temp1.next;
//             }
//             while (temp2!=null) {
//               len2++;
//                 temp2=temp2.next;
//             }

//             int diff = Math.abs(len1 - len2);
//             temp1 = head1;
//             temp2 = head2;
        
// if(len1>len2){
//     for (int i = 0; i < diff; i++) {
//         temp1=temp1.next;
//     }
// }

// else{
//     {
//         for (int i = 0; i < diff; i++) {
//             temp2=temp2.next;
//         }
//     }
// }
// while (temp1!=null&&temp2!=null) {
//     if(temp1.data==temp2.data) return temp1;

//     temp1=temp1.next;
//     temp2=temp2.next;
// }
// return null;

//     }

//     public static void main(String[] args) {
//         // Create first linked list

//         IntersectionNode list1 = new IntersectionNode();
//         list1.insert(1);
//         list1.insert(2);
//         list1.insert(3);
//         list1.insert(4);
//         list1.insert(5);

//         // Create second linked list
//         IntersectionNode list2 = new IntersectionNode();
//         list2.insert(6);
//         list2.insert(7);
//         // Connect to the intersection node (value 4)
//         Node intersection = list1.head.next.next.next; // Node with value 4
//         list2.head.next.next = intersection; // Making list2 intersect list1

//         // Print both lists
//         System.out.print("List 1: ");
//         list1.print();
//         System.out.print("List 2: ");
//         list2.print();

//         // Find intersection
//         Node intersectionNode = findIntersection(list1.head, list2.head);
//         if (intersectionNode != null) {
//             System.out.println("Intersection node: " + intersectionNode.data);
//         } else {
//             System.out.println("No intersection.");
//         }
//     }
// }
