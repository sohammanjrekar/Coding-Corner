# priority queue is a data structure that allows for efficient retrieval of the highest (or lowest) priority element.
# It is often implemented using a binary heap, which provides efficient insertion and deletion operations.  
import heapq
class PriorityQueue:
    def __init__(self):
        self.elements = []

    def is_empty(self):
        return not self.elements

    def put(self, item, priority):
        heapq.heappush(self.elements, (priority, item))

    def get(self):
        return heapq.heappop(self.elements)[1]

    def peek(self):
        return self.elements[0][1] if self.elements else None

    def size(self):
        return len(self.elements)
    def clear(self):
        self.elements = []
    def __str__(self):
        return str([item for priority, item in self.elements])
    def __repr__(self):
        return f"PriorityQueue({self.elements})"
    def visualize(self):
        import matplotlib.pyplot as plt
        import networkx as nx

        G = nx.DiGraph()
        for priority, item in self.elements:
            G.add_node(item, label=item)
            if self.elements:
                parent = self.elements[(self.elements.index((priority, item)) - 1) // 2][1]
                G.add_edge(parent, item)

        pos = nx.spring_layout(G)
        labels = nx.get_node_attributes(G, 'label')
        nx.draw(G, pos, with_labels=True, labels=labels, node_size=700, node_color='lightblue', font_size=10)
        plt.title("Priority Queue Visualization")
        plt.show()
# Example usage
if __name__ == "__main__":
    pq = PriorityQueue()
    pq.put("task1", priority=2)
    pq.put("task2", priority=1)
    pq.put("task3", priority=3)
    print("Priority Queue:")
    print(pq)
    print("Visualizing Priority Queue:")
    pq.visualize()
    print("Extracting elements:")
    while not pq.is_empty():
        print("Extracted:", pq.get())