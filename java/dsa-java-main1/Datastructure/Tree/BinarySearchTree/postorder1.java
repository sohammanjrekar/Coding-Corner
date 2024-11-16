package Tree.BinarySearchTree;

// Java code to implement the approach

// Class describing a node of tree

class posrorder1 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int v) {
            this.data = v;
            this.left = this.right = null;
        }
    }

    // Preorder Traversal
    public static void printPreorder(Node node) {
        if (node == null)
            return;

        // Traverse left subtree
        printPreorder(node.left);

        // Traverse right subtree
        printPreorder(node.right);

        // Visit node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // Build the tree
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);

        // Function call
        System.out.print("Preorder Traversal: ");
        printPreorder(root);
    }
}
