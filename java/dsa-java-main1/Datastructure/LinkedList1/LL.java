package LinkedList1;

public class LL {
    private static Node head;
    private static Node tail;
    private static int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    // add
    public void addfirst(int value) {
        Node addnode = new Node(value);
        addnode.next = head;
        head = addnode;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void addlast(int value) {
        if (tail == null) {
            addfirst(value);
            return;
        }
        Node addnode = new Node(value);
        tail.next = addnode;
        tail = addnode;
        size += 1;
    }

    public void addindex(int value, int index) {
        if (index == 0) {
            addfirst(value);
            return;
        }
        if (index == size) {
            addlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node addnode = new Node(value, temp.next);
        temp.next = addnode;
        size += 1;
    }

    // delete
    public static int deletefirst() {
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size -= 1;
        return value;
    }

    public void deletelast(int value) {
        if (size <= 1) {
            deletefirst();
            return;
        }
        Node addnode = new Node(value);
        tail.next = addnode;
        tail = addnode;
        size -= 1;
    }

    public void deleteindex(int value, int index) {
        if (index == 0) {
            addfirst(value);
            return;
        }
        if (index == size) {
            addlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node addnode = new Node(value, temp.next);
        temp.next = addnode;
        size -= 1;
    }

    public void display() {
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(300);
        list.addlast(30);
        list.addindex(3045, 3);
        System.out.println(deletefirst());
        list.display();

    }

}
