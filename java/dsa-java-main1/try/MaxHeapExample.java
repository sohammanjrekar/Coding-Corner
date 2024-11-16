import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Creating a max-heap by using a custom comparator to reverse the natural order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        // Adding elements to the max-heap
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(9);
        maxHeap.add(5);
        maxHeap.add(2);

        // Displaying the original max-heap
        System.out.println("Max-Heap: " + maxHeap);

        // Adding a new element and maintaining heap property
        maxHeap.add(6);

        // Displaying the updated max-heap
        System.out.println("Updated Max-Heap: " + maxHeap);

        // Removing elements from the max-heap
        int removedElement = maxHeap.poll();
        System.out.println("Removed element from Max-Heap: " + removedElement);
        System.out.println("Max-Heap after removal: " + maxHeap);
    }
}
