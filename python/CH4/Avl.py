# Avl is a self-balancing binary search tree where the difference in heights between left and right subtrees cannot be more than one for all nodes.
import networkx as nx
import matplotlib.pyplot as plt

class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        self.height = 1
class AVLTree:
    def insert(self, root, key):
        if not root:
            return Node(key)
        elif key < root.key:
            root.left = self.insert(root.left, key)
        else:
            root.right = self.insert(root.right, key)

        root.height = 1 + max(self.get_height(root.left), self.get_height(root.right))
        balance = self.get_balance(root)

        # Left Left Case
        if balance > 1 and key < root.left.key:
            return self.right_rotate(root)

        # Right Right Case
        if balance < -1 and key > root.right.key:
            return self.left_rotate(root)

        # Left Right Case
        if balance > 1 and key > root.left.key:
            root.left = self.left_rotate(root.left)
            return self.right_rotate(root)

        # Right Left Case
        if balance < -1 and key < root.right.key:
            root.right = self.right_rotate(root.right)
            return self.left_rotate(root)

        return root

    def left_rotate(self, z):
        y = z.right
        T2 = y.left
        y.left = z
        z.right = T2
        z.height = 1 + max(self.get_height(z.left), self.get_height(z.right))
        y.height = 1 + max(self.get_height(y.left), self.get_height(y.right))
        return y

    def right_rotate(self, z):
        y = z.left
        T3 = y.right
        y.right = z
        z.left = T3
        z.height = 1 + max(self.get_height(z.left), self.get_height(z.right))
        y.height = 1 + max(self.get_height(y.left), self.get_height(y.right))
        return y

    def get_height(self, node):
        if not node:
            return 0
        return node.height

    def get_balance(self, node):
        if not node:
            return 0
        return self.get_height(node.left) - self.get_height(node.right)
    def pre_order(self, node):
        if not node:
            return
        print("{0} ".format(node.key), end="")
        self.pre_order(node.left)
        self.pre_order(node.right)
    def in_order(self, node):
        if not node:
            return
        self.in_order(node.left)
        print("{0} ".format(node.key), end="")
        self.in_order(node.right)
    def post_order(self, node):
        if not node:
            return
        self.post_order(node.left)
        self.post_order(node.right)
        print("{0} ".format(node.key), end="")
        self.post_order(node.left)  
    def search(self, node, key):
        if not node or node.key == key:
            return node
        if key < node.key:
            return self.search(node.left, key)
        return self.search(node.right, key) 
    def delete(self, root, key):
        if not root:
            return root

        if key < root.key:
            root.left = self.delete(root.left, key)
        elif key > root.key:
            root.right = self.delete(root.right, key)
        else:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left
            temp = self.get_min_value_node(root.right)
            root.key = temp.key
            root.right = self.delete(root.right, temp.key)

        if not root:
            return root

        root.height = 1 + max(self.get_height(root.left), self.get_height(root.right))
        balance = self.get_balance(root)

        # Left Left Case
        if balance > 1 and self.get_balance(root.left) >= 0:
            return self.right_rotate(root)

        # Left Right Case
        if balance > 1 and self.get_balance(root.left) < 0:
            root.left = self.left_rotate(root.left)
            return self.right_rotate(root)

        # Right Right Case
        if balance < -1 and self.get_balance(root.right) <= 0:
            return self.left_rotate(root)

        # Right Left Case
        if balance < -1 and self.get_balance(root.right) > 0:
            root.right = self.right_rotate(root.right)
            return self.left_rotate(root)

        return root 
    def visualize_tree(self, root):
        G = nx.DiGraph()
        labels = {}

        def add_edges(node):
            if node is None:
                return
            labels[node.key] = str(node.key)
            if node.left:
                G.add_edge(node.key, node.left.key)
                add_edges(node.left)
            if node.right:
                G.add_edge(node.key, node.right.key)
                add_edges(node.right)

        add_edges(root)
        pos = self._hierarchy_pos(root)
        nx.draw(G, pos, with_labels=True, labels=labels, arrows=False,
                node_size=1000, node_color="lightgreen", font_size=10, font_weight="bold")
        plt.title("AVL Tree Visualization")
        plt.show()

    def _hierarchy_pos(self, root, width=1.0, vert_gap=0.2, vert_loc=0, xcenter=0.5, pos=None, parent=None):
        if pos is None:
            pos = {}
        if root is not None:
            pos[root.key] = (xcenter, vert_loc)
            if root.left:
                pos = self._hierarchy_pos(root.left, width=width/2, vert_gap=vert_gap,
                                        vert_loc=vert_loc - vert_gap, xcenter=xcenter - width/2, pos=pos)
            if root.right:
                pos = self._hierarchy_pos(root.right, width=width/2, vert_gap=vert_gap,
                                        vert_loc=vert_loc - vert_gap, xcenter=xcenter + width/2, pos=pos)
        return pos

avl1= AVLTree()
root = None
keys = [10, 20, 30, 40, 50, 25]
for key in keys:
    root = avl1.insert(root, key)
print("\nGraphical AVL Tree Visualization:")
avl1.visualize_tree(root)

print("Pre-order traversal of the AVL tree is:")
avl1.pre_order(root)
print("\nIn-order traversal of the AVL tree is:")
avl1.in_order(root)
print("\nPost-order traversal of the AVL tree is:")
avl1.post_order(root)
print("\nSearching for 30 in the AVL tree:")
search_result = avl1.search(root, 30)
if search_result:
    print(f"Found: {search_result.key}")    
else:
    print("Not found")
print("\nDeleting 20 from the AVL tree:")
root = avl1.delete(root, 20)
print("In-order traversal after deletion:")
avl1.in_order(root)
print("\nDeleting 30 from the AVL tree:")
root = avl1.delete(root, 30)
print("In-order traversal after deletion:")
avl1.in_order(root)
print("\nDeleting 50 from the AVL tree:")
root = avl1.delete(root, 50)
print("In-order traversal after deletion:")
avl1.in_order(root)
print("\nDeleting 10 from the AVL tree:")
root = avl1.delete(root, 10)
print("In-order traversal after deletion:")
avl1.in_order(root)
print("\nDeleting 25 from the AVL tree:")
root = avl1.delete(root, 25)
print("In-order traversal after deletion:")
avl1.in_order(root)
print("\nDeleting 40 from the AVL tree:")
root = avl1.delete(root, 40)