import heapq

# Creating an empty heap
heap = []

# Inserting elements into the heap
heapq.heappush(heap, 5)
heapq.heappush(heap, 2)
heapq.heappush(heap, 7)
heapq.heappush(heap, 1)
print("Heap after insertion:", heap)  # Output: [1, 2, 7, 5]

# Getting the smallest element (root) of the heap
smallest = heap[0]
print("Smallest element (root) of the heap:", smallest)  # Output: 1

# Removing the smallest element from the heap
removed = heapq.heappop(heap)
print("Removed smallest element from the heap:", removed)  # Output: 1
print("Heap after removal:", heap)  # Output: [2, 5, 7]

# Replacing the smallest element in the heap
heapq.heapreplace(heap, 3)
print("Heap after replacement:", heap)  # Output: [3, 5, 7]

# Converting a list into a heap
heap_list = [9, 4, 6, 3, 1, 2, 8]
heapq.heapify(heap_list)
print("Heapified list:", heap_list)  # Output: [1, 3, 2, 4, 9, 6, 8]

# Getting the n smallest elements from the heap
n_smallest = heapq.nsmallest(3, heap_list)
print("3 smallest elements:", n_smallest)  # Output: [1, 2, 3]

# Getting the n largest elements from the heap
n_largest = heapq.nlargest(3, heap_list)
print("3 largest elements:", n_largest)  # Output: [9, 8, 6]
