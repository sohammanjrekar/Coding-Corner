import java.util.ArrayList;

class MaxHeap {
    // Function to heapify a subtree rooted at index i
    void heapify(ArrayList<Integer> heap, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < size && heap.get(left) > heap.get(largest))
            largest = left;

        // Check if right child is larger than root
        if (right < size && heap.get(right) > heap.get(largest))
            largest = right;

        // If the largest is not the root, swap and recursively heapify
        if (largest != i) {
            // Swap elements at i and largest
            int temp = heap.get(largest);
            heap.set(largest, heap.get(i));
            heap.set(i, temp);

            // Recursively heapify the affected sub-tree
            heapify(heap, size, largest);
        }
    }

    // Function to insert a new element into the max-heap
    void insert(ArrayList<Integer> heap, int newNum) {
        int size = heap.size();
        heap.add(newNum);

        // Heapify from the bottom to the top
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(heap, size, i);
        }
    }

    // Function to delete a specific element from the max-heap
    void deleteNode(ArrayList<Integer> heap, int num) {
        int size = heap.size();
        int i;

        // Find the index of the element to be deleted
        for (i = 0; i < size; i++) {
            if (num == heap.get(i))
                break;
        }

        // Swap the found element with the last element
        int temp = heap.get(i);
        heap.set(i, heap.get(size - 1));
        heap.set(size - 1, temp);

        // Remove the last element
        heap.remove(size - 1);

        // Heapify the remaining elements
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(heap, size - 1, j);
        }
    }

    // Function to print the elements of the array
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(array, 3);
        maxHeap.insert(array, 4);
        maxHeap.insert(array, 9);
        maxHeap.insert(array, 5);
        maxHeap.insert(array, 2);

        System.out.println("Max-Heap array: ");
        maxHeap.printArray(array, size);

        maxHeap.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        maxHeap.printArray(array, size);
    }
}
