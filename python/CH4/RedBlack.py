# red-black tree implementation in Python
import networkx as nx
import matplotlib.pyplot as plt

class Node:
    def __init__(self, key):
        self.key = key
        self.color = 'red'  # New nodes are red by default
        self.left = None
        self.right = None
        self.parent = None
class RedBlackTree:
    def __init__(self):
        self.NIL_LEAF = Node(None)  # Sentinel node
        self.NIL_LEAF.color = 'black'  # NIL leaf is always black
        self.root = self.NIL_LEAF

    def insert(self, key):
        new_node = Node(key)
        new_node.left = self.NIL_LEAF
        new_node.right = self.NIL_LEAF
        self._insert_node(new_node)
        self._fix_insert(new_node)

    def _insert_node(self, new_node):
        parent = None
        current = self.root

        while current != self.NIL_LEAF:
            parent = current
            if new_node.key < current.key:
                current = current.left
            else:
                current = current.right

        new_node.parent = parent

        if parent is None:
            self.root = new_node
        elif new_node.key < parent.key:
            parent.left = new_node
        else:
            parent.right = new_node

    def _fix_insert(self, node):
        while node != self.root and node.parent.color == 'red':
            if node.parent == node.parent.parent.left:  # Parent is a left child
                uncle = node.parent.parent.right
                if uncle.color == 'red':  # Case 1: Uncle is red
                    node.parent.color = 'black'
                    uncle.color = 'black'
                    node.parent.parent.color = 'red'
                    node = node.parent.parent
                else:  # Case 2 and Case 3: Uncle is black or NIL
                    if node == node.parent.right:  # Case 2: Node is a right child
                        node = node.parent
                        self._left_rotate(node)
                    # Case 3: Node is a left child
                    node.parent.color = 'black'
                    node.parent.parent.color = 'red'
                    self._right_rotate(node.parent.parent)
            else:  # Parent is a right child
                uncle = node.parent.parent.left
                if uncle.color == 'red':  # Case 1: Uncle is red
                    node.parent.color = 'black'
                    uncle.color = 'black'
                    node.parent.parent.color = 'red'
                    node = node.parent.parent
                else:  # Case 2 and Case 3: Uncle is black or NIL
                    if node == node.parent.left:  # Case 2: Node is a left child
                        node = node.parent
                        self._right_rotate(node)
                    # Case 3: Node is a right child
                    node.parent.color = 'black'
                    node.parent.parent.color = 'red'
                    self._left_rotate(node.parent.parent)   
        self.root.color = 'black'
    def _left_rotate(self, x):
        y = x.right
        x.right = y.left
        if y.left != self.NIL_LEAF:
            y.left.parent = x
        y.parent = x.parent
        if x.parent is None:
            self.root = y
        elif x == x.parent.left:
            x.parent.left = y
        else:
            x.parent.right = y
        y.left = x
        x.parent = y
        y.color = 'black'
        x.color = 'red'
    def _right_rotate(self, y):
        x = y.left
        y.left = x.right
        if x.right != self.NIL_LEAF:
            x.right.parent = y
        x.parent = y.parent
        if y.parent is None:
            self.root = x
        elif y == y.parent.right:
            y.parent.right = x
        else:
            y.parent.left = x
        x.right = y
        y.parent = x
        x.color = 'black'
        y.color = 'red'
    def inorder(self, node=None):
        if node is None:
            node = self.root
        if node != self.NIL_LEAF:
            self.inorder(node.left)
            print(f"{node.key} ({node.color})", end=' ')
            self.inorder(node.right)
    def search(self, key):
        current = self.root
        while current != self.NIL_LEAF:
            if key == current.key:
                return current
            elif key < current.key:
                current = current.left
            else:
                current = current.right
        return None
    

    def visualize_tree(self):
        G = nx.DiGraph()
        color_map = {}

        def add_edges(node):
            if node == self.NIL_LEAF or node is None:
                return
            G.add_node(node.key)
            color_map[node.key] = node.color

            if node.left != self.NIL_LEAF:
                G.add_edge(node.key, node.left.key)
                add_edges(node.left)
            if node.right != self.NIL_LEAF:
                G.add_edge(node.key, node.right.key)
                add_edges(node.right)

        add_edges(self.root)

        # Positioning using a hierarchy
        pos = self._hierarchy_pos(self.root)

        node_colors = ['red' if color_map[n] == 'red' else 'black' for n in G.nodes()]
        nx.draw(G, pos, with_labels=True, node_color=node_colors,
                node_size=1000, font_color='white', font_size=10, font_weight='bold')
        plt.title("Red-Black Tree Visualization")
        plt.show()

    def _hierarchy_pos(self, root, width=1.0, vert_gap=0.2, vert_loc=0, xcenter=0.5, pos=None):
        if pos is None:
            pos = {}
        if root is None or root == self.NIL_LEAF:
            return pos

        pos[root.key] = (xcenter, vert_loc)

        if root.left != self.NIL_LEAF:
            pos = self._hierarchy_pos(root.left, width=width/2, vert_gap=vert_gap,
                                    vert_loc=vert_loc - vert_gap, xcenter=xcenter - width/2, pos=pos)
        if root.right != self.NIL_LEAF:
            pos = self._hierarchy_pos(root.right, width=width/2, vert_gap=vert_gap,
                                    vert_loc=vert_loc - vert_gap, xcenter=xcenter + width/2, pos=pos)
        return pos




    def delete(self, key):
        node_to_delete = self.search(key)
        if node_to_delete is None:
            return
        # Proceed with deletion
        self._delete_node(node_to_delete)
    def _delete_node(self, node):
        y = node
        y_original_color = y.color
        if node.left == self.NIL_LEAF:
            x = node.right
            self._transplant(node, node.right)
        elif node.right == self.NIL_LEAF:
            x = node.left
            self._transplant(node, node.left)
        else:
            y = self._minimum(node.right)
            y_original_color = y.color
            x = y.right
            if y.parent == node:
                x.parent = y
            else:
                self._transplant(y, y.right)
                y.right = node.right
                y.right.parent = y
            self._transplant(node, y)
            y.left = node.left
            y.left.parent = y
            y.color = node.color

        if y_original_color == 'black':
            self._fix_delete(x)
tree3= RedBlackTree()
tree3.insert(10)
tree3.insert(20)
tree3.insert(30)
tree3.insert(15)
tree3.insert(25)
tree3.insert(5)
tree3.insert(1)
tree3.insert(7)
tree3.insert(3)
tree3.insert(8)
tree3.insert(6)  
print("\nRed-Black Tree Structure:")
tree3.visualize_tree()

tree3.inorder()
print("\nAfter inserting elements:")
tree3.inorder(tree3.root)
print("\nSearching for 15:", tree3.search(15).key if tree3.search
(15) else "Not found")
print("Searching for 100:", tree3.search(100).key if tree3.search(100) else "Not found")
print("\nDeleting 20:")
tree3.delete(20)
tree3.inorder(tree3.root)
print("\nDeleting 30:")
tree3.delete(30)
tree3.inorder(tree3.root)
print("\nDeleting 10:")
tree3.delete(10)
tree3.inorder(tree3.root)
print("\nDeleting 5:")
tree3.delete(5)
tree3.inorder(tree3.root)
print("\nDeleting 15:")
tree3.delete(15)
tree3.inorder(tree3.root)
print("\nDeleting 25:")
tree3.delete(25)
tree3.inorder(tree3.root)
