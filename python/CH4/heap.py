import matplotlib.pyplot as plt
import networkx as nx

class MinHeap:
    def __init__(self):
        self.heap = []

    def insert(self, key):
        self.heap.append(key)
        self._bubble_up(len(self.heap) - 1)

    def extract_min(self):
        if not self.heap:
            return None
        if len(self.heap) == 1:
            return self.heap.pop()
        min_val = self.heap[0]
        self.heap[0] = self.heap.pop()
        self._bubble_down(0)
        return min_val

    def _bubble_up(self, index):
        parent = (index - 1) // 2
        if index > 0 and self.heap[index] < self.heap[parent]:
            self.heap[index], self.heap[parent] = self.heap[parent], self.heap[index]
            self._bubble_up(parent)

    def _bubble_down(self, index):
        smallest = index
        left = 2 * index + 1
        right = 2 * index + 2
        if left < len(self.heap) and self.heap[left] < self.heap[smallest]:
            smallest = left
        if right < len(self.heap) and self.heap[right] < self.heap[smallest]:
            smallest = right
        if smallest != index:
            self.heap[index], self.heap[smallest] = self.heap[smallest], self.heap[index]
            self._bubble_down(smallest)

    def peek(self):
        return self.heap[0] if self.heap else None

    def is_empty(self):
        return len(self.heap) == 0

    def visualize_heap(self, title="Min Heap Visualization"):
        self._draw_heap(title)


class MaxHeap:
    def __init__(self):
        self.heap = []

    def insert(self, key):
        self.heap.append(key)
        self._bubble_up(len(self.heap) - 1)

    def extract_max(self):
        if not self.heap:
            return None
        if len(self.heap) == 1:
            return self.heap.pop()
        max_val = self.heap[0]
        self.heap[0] = self.heap.pop()
        self._bubble_down(0)
        return max_val

    def _bubble_up(self, index):
        parent = (index - 1) // 2
        if index > 0 and self.heap[index] > self.heap[parent]:
            self.heap[index], self.heap[parent] = self.heap[parent], self.heap[index]
            self._bubble_up(parent)

    def _bubble_down(self, index):
        largest = index
        left = 2 * index + 1
        right = 2 * index + 2
        if left < len(self.heap) and self.heap[left] > self.heap[largest]:
            largest = left
        if right < len(self.heap) and self.heap[right] > self.heap[largest]:
            largest = right
        if largest != index:
            self.heap[index], self.heap[largest] = self.heap[largest], self.heap[index]
            self._bubble_down(largest)

    def peek(self):
        return self.heap[0] if self.heap else None

    def is_empty(self):
        return len(self.heap) == 0

    def visualize_heap(self, title="Max Heap Visualization"):
        self._draw_heap(title)

    def _draw_heap(self, title):
        if not self.heap:
            print("Heap is empty.")
            return

        G = nx.DiGraph()
        labels = {}

        for i, val in enumerate(self.heap):
            G.add_node(i)
            labels[i] = val
            left = 2 * i + 1
            right = 2 * i + 2
            if left < len(self.heap):
                G.add_edge(i, left)
            if right < len(self.heap):
                G.add_edge(i, right)

        pos = self._hierarchy_pos(0)
        nx.draw(G, pos, with_labels=False, node_color='lightblue', node_size=1200)
        nx.draw_networkx_labels(G, pos, labels={i: str(v) for i, v in labels.items()},
                                font_size=12, font_weight='bold')
        plt.title(title)
        plt.show()

    def _hierarchy_pos(self, root_idx, width=1.5, vert_gap=0.2, vert_loc=0, xcenter=0.5, pos=None):
        if pos is None:
            pos = {}
        if root_idx >= len(self.heap):
            return pos
        pos[root_idx] = (xcenter, vert_loc)
        left = 2 * root_idx + 1
        right = 2 * root_idx + 2
        if left < len(self.heap):
            pos = self._hierarchy_pos(left, width / 2, vert_gap, vert_loc - vert_gap, xcenter - width / 2, pos)
        if right < len(self.heap):
            pos = self._hierarchy_pos(right, width / 2, vert_gap, vert_loc - vert_gap, xcenter + width / 2, pos)
        return pos

# Reuse drawing for both
MinHeap._draw_heap = MaxHeap._draw_heap
MinHeap._hierarchy_pos = MaxHeap._hierarchy_pos

if __name__ == "__main__":
    print("📉 MIN HEAP:")
    min_heap = MinHeap()
    for val in [5, 3, 8, 1]:
        min_heap.insert(val)
    min_heap.visualize_heap("Min Heap After Insertions")
    while not min_heap.is_empty():
        print("\nExtracted min:", min_heap.extract_min())
        print("Current min:", min_heap.peek() if not min_heap.is_empty() else "Heap is now empty")
        min_heap.visualize_heap("Min Heap After Extraction")

    print("\n\n📈 MAX HEAP:")
    max_heap = MaxHeap()
    for val in [5, 3, 8, 1]:
        max_heap.insert(val)
    max_heap.visualize_heap("Max Heap After Insertions")
    while not max_heap.is_empty():
        print("\nExtracted max:", max_heap.extract_max())
        print("Current max:", max_heap.peek() if not max_heap.is_empty() else "Heap is now empty")
        max_heap.visualize_heap("Max Heap After Extraction")

# ✅ 1. Min Heap Library in Python
# Python’s heapq module provides a binary min-heap implementation.

# Example:
# import heapq

# heap = []
# heapq.heappush(heap, 10)
# heapq.heappush(heap, 5)
# heapq.heappush(heap, 20)

# print("Min:", heapq.heappop(heap))  # Output: 5