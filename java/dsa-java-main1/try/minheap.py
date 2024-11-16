class MinHeap:
    def __init__(self):
        # Initialize an empty list for the min-heap
        self.heap = []

    # Function to heapify a subtree rooted at index i
    def heapify(self, i):
        smallest = i
        left = 2 * i + 1
        right = 2 * i + 2

        # Check if left child is smaller than root
        if left < len(self.heap) and self.heap[left] < self.heap[smallest]:
            smallest = left

        # Check if right child is smaller than root
        if right < len(self.heap) and self.heap[right] < self.heap[smallest]:
            smallest = right

        # If the smallest is not the root, swap and recursively heapify
        if smallest != i:
            self.heap[i], self.heap[smallest] = self.heap[smallest], self.heap[i]
            self.heapify(smallest)

    # Function to insert a new element into the min-heap
    def insert(self, new_num):
        # Add the new element to the heap
        self.heap.append(new_num)

        # Heapify from the bottom to the top
        for i in range(len(self.heap) // 2 - 1, -1, -1):
            self.heapify(i)

    # Function to delete a specific element from the min-heap
    def delete_node(self, num):
        # Find the index of the element to be deleted
        index = self.heap.index(num) if num in self.heap else -1

        # If the element is found
        if index != -1:
            # Swap the element with the last element
            self.heap[index], self.heap[-1] = self.heap[-1], self.heap[index]
            # Remove the last element
            self.heap.pop()

            # Heapify the remaining elements
            for i in range(len(self.heap) // 2 - 1, -1, -1):
                self.heapify(i)

    # Function to print the elements of the heap
    def print_heap(self):
        print("Min-Heap array:", self.heap)

if __name__ == "__main__":
    # Create an instance of MinHeap
    min_heap = MinHeap()

    # Insert elements into the min-heap
    min_heap.insert(3)
    min_heap.insert(4)
    min_heap.insert(9)
    min_heap.insert(5)
    min_heap.insert(2)

    # Print the original min-heap
    min_heap.print_heap()

    # Add a new element and maintain heap property
    min_heap.insert(6)
    # Print the updated min-heap
    min_heap.print_heap()

    # Delete a specific element from the heap
    min_heap.delete_node(4)
    # Print the min-heap after deletion
    min_heap.print_heap()
