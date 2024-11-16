import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Function to heapify a subtree rooted at index i
    private void heapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is smaller than root
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        // Check if right child is smaller than root
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        // If the smallest is not the root, swap and recursively heapify
        if (smallest != i) {
            Collections.swap(heap, i, smallest);
            heapify(smallest);
        }
    }

    // Function to insert a new element into the min-heap
    public void insert(int newNum) {
        heap.add(newNum);

        // Heapify from the bottom to the top
        for (int i = heap.size() / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    // Function to print the elements of the heap
    public void printHeap() {
        System.out.println("Min-Heap array: " + heap);
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(4);
        minHeap.insert(9);
        minHeap.insert(5);
        minHeap.insert(2);

        minHeap.printHeap();

        // Add a new element and maintain heap property
        minHeap.insert(6);
        minHeap.printHeap();
    }
}
