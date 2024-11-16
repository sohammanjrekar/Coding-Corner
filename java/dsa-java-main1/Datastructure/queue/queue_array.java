package Queue;

public class queue_array {
    static class queue {
        static int[] array = new int[5];
        static int rear = 0;
        static int front = 0;

        public void add(int data) {

            array[rear] = data;
            rear = (rear + 1) % array.length;

        }

        public void display() {
            int temp = front;
            while (temp <= rear) {
                System.out.print(array[temp] + " ");
                temp++;
            }
        }

        public int deque() {
            int val = array[front];
            int i = 0;
            while (i <= rear) {
                array[i] = array[i + 1];
                i++;
            }
            return val;
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(45);
        q.add(78);
        q.add(58);
        // q.add(68);
        q.display();
        System.out.println();
        q.deque();
        q.display();
    }
}
