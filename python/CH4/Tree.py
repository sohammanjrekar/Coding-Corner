# Tree is a data structure that consists of nodes connected by edges.
# Each node contains a value and may have references to child nodes, forming a hierarchical structure.
from collections import deque
import networkx as nx
import matplotlib.pyplot as plt

class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, value):
        if not self.root:
            self.root = TreeNode(value)
        else:
            self._insert_recursive(self.root, value)

    def _insert_recursive(self, node, value):
        if value < node.value:
            if node.left is None:
                node.left = TreeNode(value)
            else:
                self._insert_recursive(node.left, value)
        else:
            if node.right is None:
                node.right = TreeNode(value)
            else:
                self._insert_recursive(node.right, value)

   # Public method
    def inorder_traversal(self):
        self._inorder_recursive(self.root)
    def _inorder_recursive(self, node):
        if node:
            self._inorder_recursive(node.left)
            print(node.value, end=' ')
            self._inorder_recursive(node.right)

    def preorder_traversal(self):
        self._preorder_recursive(self.root)
    def _preorder_recursive(self, node):
        if node:
            print(node.value, end=' ')
            self._preorder_recursive(node.left)
            self._preorder_recursive(node.right)

    def postorder_traversal(self):
        self._postorder_recursive(self.root)
    def _postorder_recursive(self, node):
        if node:
            self._postorder_recursive(node.left)
            self._postorder_recursive(node.right)
            print(node.value, end=' ')

    def search(self, value, node=None):
        if node is None:
            node = self.root
        if node is None:
            return False
        if node.value == value:
            return True
        elif value < node.value:
            return self.search(value, node.left)
        else:
            return self.search(value, node.right)
    def delete(self, value):
        self.root = self._delete_recursive(self.root, value)    
    def _delete_recursive(self, node, value):
        if node is None:
            return node
        if value < node.value:
            node.left = self._delete_recursive(node.left, value)
        elif value > node.value:
            node.right = self._delete_recursive(node.right, value)
        else:
            # Node with one child or no child
            if node.left is None:
                return node.right
            elif node.right is None:
                return node.left
            # Node with two children: Get the inorder successor (smallest in the right subtree)
            temp = self._min_value_node(node.right)
            node.value = temp.value
            node.right = self._delete_recursive(node.right, temp.value)
        return node
    def visualize_tree(self):
        G = nx.DiGraph()
        labels = {}

        def add_edges(node):
            if node is None:
                return
            labels[node.value] = str(node.value)
            if node.left:
                G.add_edge(node.value, node.left.value)
                add_edges(node.left)
            if node.right:
                G.add_edge(node.value, node.right.value)
                add_edges(node.right)

        add_edges(self.root)

        pos = self._hierarchy_pos(self.root)
        nx.draw(G, pos, with_labels=True, labels=labels, arrows=False, node_size=1000, node_color="skyblue", font_size=10)
        plt.title("Binary Search Tree Visualization")
        plt.show()

    def _hierarchy_pos(self, root, width=1.0, vert_gap=0.2, vert_loc=0, xcenter=0.5, pos=None, parent=None):
        if pos is None:
            pos = {}
        if root is not None:
            pos[root.value] = (xcenter, vert_loc)
            if root.left:
                pos = self._hierarchy_pos(root.left, width=width/2, vert_gap=vert_gap,
                                        vert_loc=vert_loc - vert_gap, xcenter=xcenter - width/2, pos=pos, parent=root)
            if root.right:
                pos = self._hierarchy_pos(root.right, width=width/2, vert_gap=vert_gap,
                                        vert_loc=vert_loc - vert_gap, xcenter=xcenter + width/2, pos=pos, parent=root)
        return pos


    def level_order_traversal(self):
        if not self.root:
            return
        queue = deque([(self.root, 0)])
        current_level = 0
        print("Level 0: ", end='')

        while queue:
            node, level = queue.popleft()

            if level > current_level:
                current_level = level
                print(f"\nLevel {level}: ", end='')

            print(node.value, end=' ')

            if node.left:
                queue.append((node.left, level + 1))
            if node.right:
                queue.append((node.right, level + 1))

tree1 = BinaryTree()
tree1.insert(5)
tree1.insert(3)
tree1.insert(7)
tree1.insert(2)
tree1.insert(4)
tree1.insert(6)
tree1.insert(8)

print("Inorder Traversal:")
tree1.inorder_traversal()
print("\nPreorder Traversal:")
tree1.preorder_traversal()
print("\nPostorder Traversal:")
tree1.postorder_traversal()
print("\n\nLevel-Order Traversal:")
tree1.level_order_traversal()
print("\n\nGraphical Visualization:")
tree1.visualize_tree()