public class doublelinkedlist {
    static class Node {
        int value;
        Node next;
        Node previous;

        Node(int data) {
            this.value = data;
            this.next = null;
            this.previous = null;
        }
    }

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        doublelinkedlist dll = new doublelinkedlist();
        doublelinkedlist.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node tail = third;

        // connect in both direction
        doublelinkedlist.head.next = second;
        second.next = third;

        tail.previous = second;
        second.previous = doublelinkedlist.head;

        while (doublelinkedlist.head != null) {
            System.out.print(doublelinkedlist.head.value + "->");
            doublelinkedlist.head = doublelinkedlist.head.next;
        }
        System.out.println();
        while (tail != null) {
            System.out.print(tail.value + "<-");
            tail = tail.previous;
        }

    }
}
