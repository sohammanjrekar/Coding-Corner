# Function to heapify a subtree rooted at node i
def heapify(arr, size, root):
    largest = root
    left = 2 * root + 1
    right = 2 * root + 2

    if left < size and arr[root] < arr[left]:
        largest = left

    if right < size and arr[largest] < arr[right]:
        largest = right

    if largest != root:
        arr[root], arr[largest] = arr[largest], arr[root]
        heapify(arr, size, largest)

# Function to insert a new element into the max-heap
def insert_into_max_heap(heap, new_element):
    size = len(heap)

    if size == 0:
        heap.append(new_element)
    else:
        heap.append(new_element)
        for i in range((size // 2) - 1, -1, -1):
            heapify(heap, size, i)

# Function to delete a specific element from the max-heap
def delete_from_max_heap(heap, element_to_delete):
    size = len(heap)
    i = 0

    for i in range(0, size):
        if element_to_delete == heap[i]:
            break

    heap[i], heap[size - 1] = heap[size - 1], heap[i]
    heap.pop()

    for i in range((len(heap) // 2) - 1, -1, -1):
        heapify(heap, len(heap), i)

# Example usage
max_heap = []
insert_into_max_heap(max_heap, 3)
insert_into_max_heap(max_heap, 4)
insert_into_max_heap(max_heap, 9)
insert_into_max_heap(max_heap, 5)
insert_into_max_heap(max_heap, 2)

print("Max-Heap array: " + str(max_heap))

delete_from_max_heap(max_heap, 4)
print("After deleting an element: " + str(max_heap))
