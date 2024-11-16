import java.util.PriorityQueue;

public class minheappq {
    public static void main(String[] args) {
        // Creating a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min-heap
        minHeap.add(3);
        minHeap.add(4);
        minHeap.add(9);
        minHeap.add(5);
        minHeap.add(2);

        // Displaying the original min-heap
        System.out.println("Min-Heap: " + minHeap);

        // Adding a new element and maintaining heap property
        minHeap.add(6);

        // Displaying the updated min-heap
        System.out.println("Updated Min-Heap: " + minHeap);

        // Removing elements from the min-heap
        int removedElement = minHeap.poll();
        System.out.println("Removed element from Min-Heap: " + removedElement);
        System.out.println("Min-Heap after removal: " + minHeap);
    }
}
