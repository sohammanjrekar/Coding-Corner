import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinHeap1 {
    private List<Integer> heap;

    public MinHeap1() {
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

    // Function to delete a specific element from the min-heap
    public void deleteNode(int num) {
        int index = heap.indexOf(num);
        if (index != -1) {
            Collections.swap(heap, index, heap.size() - 1);
            heap.remove(heap.size() - 1);

            // Heapify the remaining elements
            for (int i = heap.size() / 2 - 1; i >= 0; i--) {
                heapify(i);
            }
        }
    }

    // Function to print the elements of the heap
    public void printHeap() {
        System.out.println("Min-Heap array: " + heap);
    }

    public static void main(String[] args) {
        MinHeap1 minHeap = new MinHeap1();
        minHeap.insert(3);
        minHeap.insert(4);
        minHeap.insert(9);
        minHeap.insert(5);
        minHeap.insert(2);

        minHeap.printHeap();

        // Add a new element and maintain heap property
        minHeap.insert(6);

        minHeap.printHeap();

        // Delete a specific element from the heap
        minHeap.deleteNode(4);
        minHeap.printHeap();
    }
}
