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

// public class reverseLL {
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
// public void reverse(){
//     Node prev=null;
//     Node curr=head;
//     Node next=null;
//     while(curr!=null){
//         next=curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr=next;
//     }
//     head=prev;
// }
   
//     public static void main(String[] args) {
//         reverseLL ll = new reverseLL();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(4);

//         ll.print();
//         ll.reverse();
//         ll.print();

//     }
// }