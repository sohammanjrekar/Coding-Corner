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

// public class AddTwoNumberLL {
//     Node head;
//     Node tail;

//     // Method to insert a new node at the end
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

//     // Method to print the linked list
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Method to add two numbers represented by linked lists
//     public static AddTwoNumberLL add(AddTwoNumberLL list1, AddTwoNumberLL list2) {
//         Node temp1 = list1.head;
//         Node temp2 = list2.head;
//         AddTwoNumberLL resultList = new AddTwoNumberLL();
//         int carry = 0;

//         while (temp1 != null || temp2 != null) {
//             int x = (temp1 != null) ? temp1.data : 0;
//             int y = (temp2 != null) ? temp2.data : 0;
//             int sum = carry + x + y;
//             carry = sum / 10;
//             resultList.insert(sum % 10);

//             if (temp1 != null) temp1 = temp1.next;
//             if (temp2 != null) temp2 = temp2.next;
//         }

//         if (carry > 0) {
//             resultList.insert(carry);
//         }

//         return resultList;
//     }

//     public static void main(String[] args) {
//         AddTwoNumberLL list1 = new AddTwoNumberLL();
//         list1.insert(2);
//         list1.insert(4);
//         list1.insert(6);
//         System.out.println("List 1:");
//         list1.print();

//         AddTwoNumberLL list2 = new AddTwoNumberLL();
//         list2.insert(3);
//         list2.insert(8);
//         list2.insert(7);
//         System.out.println("List 2:");
//         list2.print();

//         AddTwoNumberLL resultList = AddTwoNumberLL.add(list1, list2);
//         System.out.println("Resultant List:");
//         resultList.print();
//     }
// }
