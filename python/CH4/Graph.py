# graph is a data structure that consists of nodes connected by edges.
# It allows for efficient representation and traversal of relationships between entities.
from collections import deque
import networkx as nx
import matplotlib.pyplot as plt

class Graph:
    def __init__(self):
        self.adjacency_list = {}

    def add_edge(self, node1, node2):
        if node1 not in self.adjacency_list:
            self.adjacency_list[node1] = []
        if node2 not in self.adjacency_list:
            self.adjacency_list[node2] = []
        self.adjacency_list[node1].append(node2)
        self.adjacency_list[node2].append(node1)

    def print_graph(self):
        for node, neighbors in self.adjacency_list.items():
            print(f"{node}: {', '.join(map(str, neighbors))}")

    def bfs(self, start):
        visited = set()
        queue = deque([start])
        while queue:
            node = queue.popleft()
            if node not in visited:
                print("Visiting:", node)
                visited.add(node)
                for neighbor in self.adjacency_list.get(node, []):
                    if neighbor not in visited:
                        queue.append(neighbor)
        print("BFS complete")

    def dfs(self, start, visited=None):
        if visited is None:
            visited = set()
        if start not in visited:
            print("Visiting:", start)
            visited.add(start)
            for neighbor in self.adjacency_list.get(start, []):
                if neighbor not in visited:
                    self.dfs(neighbor, visited)
        print("DFS complete")
    def has_cycle(self):
        visited = set()

        def dfs(node, parent):
            visited.add(node)
            for neighbor in self.adjacency_list.get(node, []):
                if neighbor not in visited:
                    if dfs(neighbor, node):
                        return True
                elif neighbor != parent:
                    return True
            return False

        for node in self.adjacency_list:
            if node not in visited:
                if dfs(node, None):
                    return True
        return False
    def shortest_path(self, start, end):
        visited = set()
        queue = deque([(start, [start])])
        while queue:
            node, path = queue.popleft()
            if node == end:
                return path
            if node not in visited:
                visited.add(node)
                for neighbor in self.adjacency_list.get(node, []):
                    if neighbor not in visited:
                        queue.append((neighbor, path + [neighbor]))
        return None
    def topological_sort(self):
        visited = set()
        stack = []

        def dfs(node):
            visited.add(node)
            for neighbor in self.adjacency_list.get(node, []):
                if neighbor not in visited:
                    dfs(neighbor)
            stack.append(node)

        for node in self.adjacency_list:
            if node not in visited:
                dfs(node)

        return stack[::-1]
    # i want see real graph structure
    def visualize(self):
        

        G = nx.Graph()
        for node, neighbors in self.adjacency_list.items():
            for neighbor in neighbors:
                G.add_edge(node, neighbor)

        pos = nx.spring_layout(G)
        nx.draw(G, pos, with_labels=True, node_color='lightblue', node_size=500, font_size=10, font_color='black')
        plt.show()
graph1 = Graph()
graph1.add_edge(1, 2)
graph1.add_edge(1, 3)
graph1.add_edge(2, 4)
graph1.add_edge(3, 5)
graph1.visualize()
graph1.print_graph()
print("BFS starting from node 1:")
graph1.bfs(1)
print("DFS starting from node 1:")
graph1.dfs(1)
print("Checking for cycles in the graph:")
if graph1.has_cycle():
    print("Graph has a cycle.") 
else:
    print("Graph does not have a cycle.")   
print("Shortest path from 1 to 4:", graph1.shortest_path(1, 4))
print("Topological sort of the graph:", graph1.topological_sort())
