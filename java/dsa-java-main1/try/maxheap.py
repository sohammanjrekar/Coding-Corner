class MaxHeap:
    def __init__(self):
        # Initialize an empty list for the max-heap
        self.heap = []

    # Function to heapify a subtree rooted at index i
    def heapify(self, i):
        largest = i
        left = 2 * i + 1
        right = 2 * i + 2

        # Check if left child is larger than root
        if left < len(self.heap) and self.heap[left] > self.heap[largest]:
            largest = left

        # Check if right child is larger than root
        if right < len(self.heap) and self.heap[right] > self.heap[largest]:
            largest = right

        # If the largest is not the root, swap and recursively heapify
        if largest != i:
            self.heap[i], self.heap[largest] = self.heap[largest], self.heap[i]
            self.heapify(largest)

    # Function to insert a new element into the max-heap
    def insert(self, new_num):
        # Add the new element to the heap
        self.heap.append(new_num)
        i = len(self.heap) - 1
        parent = (i - 1) // 2

        # Check if the parent is smaller than the new element
        while i > 0 and self.heap[parent] < self.heap[i]:
            self.heap[i], self.heap[parent] = self.heap[parent], self.heap[i]
            i = parent
            parent = (i - 1) // 2

    # Function to print the elements of the heap
    def print_heap(self):
        print("Max-Heap array:", self.heap)

if __name__ == "__main__":
    # Create an instance of MaxHeap
    max_heap = MaxHeap()

    # Insert elements into the max-heap
    max_heap.insert(3)
    max_heap.insert(4)
    max_heap.insert(9)
    max_heap.insert(5)
    max_heap.insert(2)

    # Print the original max-heap
    max_heap.print_heap()

    # Add a new element and maintain heap property
    max_heap.insert(6)
    # Print the updated max-heap
    max_heap.print_heap()
