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

// public class SortLL {
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

//     public void sort() {
//       Node temp=head;
//       Node temp0=new Node(-1);
//       Node temp1=new Node(-1);
//       Node temp2=new Node(-1);
//       Node main0=temp0;
//       Node main1=temp1;
//       Node main2=temp2;



//       while(temp!=null){
     
//         if(temp.data==0){
//             temp0.next=temp;
//             temp0=temp0.next;
//         } else if(temp.data==1){
//             temp1.next=temp;
//             temp1=temp1.next;
//         }else{
           
//                 temp2.next=temp;
//                 temp2=temp2.next;
            
//         }
//         temp=temp.next;
//       }
//       temp2.next=null;
//       temp0.next=(temp1!=null)?main1.next:main2.next;
//       temp1.next=main2.next;
//       head=main0.next;
      
//     }

//     public static void main(String[] args) {
//         SortLL ll = new SortLL();
//         ll.insert(1);
//         ll.insert(0);
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(0);
//         ll.insert(2);
//         ll.insert(1);

//         ll.print();
//         ll.sort();
//         ll.print();
//     }
// }
