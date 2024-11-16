package Stack1;

public class stack_linkedlist {

    private static Node head;
    private static Node tail;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void inputstack(int data) {
        Node currNode = new Node(data);
        if (head == null) {
            head = currNode;
        } else {
            currNode.next = head;
            head = currNode;
        }
    }

    public int pop() {
        int val = head.data;
        head = head.next;
        return val;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stack_linkedlist list = new stack_linkedlist();
        list.inputstack(15);
        list.inputstack(145);
        list.inputstack(45);
        list.inputstack(105);
        list.display();
        System.out.println();
        System.out.println(list.pop());
        list.display();
    }
}
