class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self):
        self.root = None

    def insert(self, data):
        """Inserts a new node with the given data into the BST."""
        self.root = self._insert_recursive(self.root, data)

    def _insert_recursive(self, node, data):
        """Helper function for recursive insertion."""
        if node is None:
            return TreeNode(data)
        if data < node.data:
            node.left = self._insert_recursive(node.left, data)
        elif data > node.data:
            node.right = self._insert_recursive(node.right, data)
        return node

    def search(self, data):
        """Searches for a node with the given data in the BST."""
        return self._search_recursive(self.root, data)

    def _search_recursive(self, node, data):
        """Helper function for recursive search."""
        if node is None or node.data == data:
            return node
        elif data < node.data:
            return self._search_recursive(node.left, data)
        else:
            return self._search_recursive(node.right, data)

    def delete(self, data):
        """Deletes a node with the given data from the BST."""
        self.root = self._delete_recursive(self.root, data)

    def _delete_recursive(self, node, data):
        """Helper function for recursive deletion."""
        if node is None:
            return node

        if data < node.data:
            node.left = self._delete_recursive(node.left, data)
        elif data > node.data:
            node.right = self._delete_recursive(node.right, data)
        else:
            if node.left is None:
                temp = node.right
                node = None
                return temp
            elif node.right is None:
                temp = node.left
                node = None
                return temp
            temp = self._min_value_node(node.right)
            node.data = temp.data
            node.right = self._delete_recursive(node.right, temp.data)

        return node

    def _min_value_node(self, node):
        """Helper function to find the node with the minimum value."""
        current = node
        while current.left:
            current = current.left
        return current

    def inorder_traversal(self, node):
        """Performs inorder traversal of the BST."""
        if node:
            self.inorder_traversal(node.left)
            print(node.data, end=" ")
            self.inorder_traversal(node.right)

    def preorder_traversal(self, node):
        """Performs preorder traversal of the BST."""
        if node:
            print(node.data, end=" ")
            self.preorder_traversal(node.left)
            self.preorder_traversal(node.right)

    def postorder_traversal(self, node):
        """Performs postorder traversal of the BST."""
        if node:
            self.postorder_traversal(node.left)
            self.postorder_traversal(node.right)
            print(node.data, end=" ")

# Example usage:
bst = BinarySearchTree()
bst.insert(5)
bst.insert(3)
bst.insert(7)
bst.insert(2)
bst.insert(4)
bst.insert(6)
bst.insert(8)

print("Inorder traversal:", end=" ")
bst.inorder_traversal(bst.root)
print()

print("Preorder traversal:", end=" ")
bst.preorder_traversal(bst.root)
print()

print("Postorder traversal:", end=" ")
bst.postorder_traversal(bst.root)
print()

print("Searching for 3:", bst.search(3))  # Output: TreeNode object
print("Searching for 9:", bst.search(9))  # Output: None

bst.delete(3)  # Deleting node with value 3

print("Inorder traversal after deletion:", end=" ")
bst.inorder_traversal(bst.root)
print()
