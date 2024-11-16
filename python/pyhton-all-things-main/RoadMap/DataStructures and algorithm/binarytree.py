class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, data):
        """Inserts a new node with the given data into the binary tree."""
        if not self.root:
            self.root = TreeNode(data)
        else:
            self._insert_recursive(self.root, data)

    def _insert_recursive(self, node, data):
        """Helper function for recursive insertion."""
        if data < node.data:
            if node.left is None:
                node.left = TreeNode(data)
            else:
                self._insert_recursive(node.left, data)
        elif data > node.data:
            if node.right is None:
                node.right = TreeNode(data)
            else:
                self._insert_recursive(node.right, data)

    def search(self, data):
        """Searches for a node with the given data in the binary tree."""
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
        """Deletes a node with the given data from the binary tree."""
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
            # Case 1: Node has no children or only one child
            if node.left is None:
                temp = node.right
                node = None
                return temp
            elif node.right is None:
                temp = node.left
                node = None
                return temp

            # Case 2: Node has two children
            # Find the minimum value node in the right subtree
            temp = self._min_value_node(node.right)
            # Copy the inorder successor's content to this node
            node.data = temp.data
            # Delete the inorder successor
            node.right = self._delete_recursive(node.right, temp.data)

        return node

    def _min_value_node(self, node):
        """Helper function to find the node with the minimum value."""
        current = node
        while current.left:
            current = current.left
        return current

    def inorder_traversal(self, node):
        """Performs inorder traversal of the binary tree."""
        if node:
            self.inorder_traversal(node.left)
            print(node.data, end=" ")
            self.inorder_traversal(node.right)

# Example usage:
tree = BinaryTree()
tree.insert(5)
tree.insert(3)
tree.insert(7)
tree.insert(2)
tree.insert(4)
tree.insert(6)
tree.insert(8)

print("Inorder traversal before deletion:", end=" ")
tree.inorder_traversal(tree.root)
print()

tree.delete(3)  # Deleting node with value 3

print("Inorder traversal after deletion:", end=" ")
tree.inorder_traversal(tree.root)
print()
