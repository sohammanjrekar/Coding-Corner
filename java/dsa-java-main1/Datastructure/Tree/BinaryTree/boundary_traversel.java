package Tree.BinaryTree;

// Java code to implement the above approach

// Definition of a binary tree node
class Node {
    int data;
    Node left, right;

    // Constructor to create a new binary tree node
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    // Function to print the left boundary nodes of a binary tree
    static void printLeftBoundary(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");
        }
        if (root.left != null) {
            printLeftBoundary(root.left);
        } else {
            printLeftBoundary(root.right);
        }
    }

    // Function to print the right boundary nodes of a binary tree
    static void printRightBoundary(Node root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            printRightBoundary(root.right);
        } else {
            printRightBoundary(root.left);
        }
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");
        }
    }

    // Function to print the leaves of a binary tree
    static void printLeaves(Node root) {
        if (root == null) {
            return;
        }
        printLeaves(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeaves(root.right);
    }

    // Function to print the boundary nodes of a binary tree in anticlockwise order
    static void printBoundary(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);
    }

    // Driver code
    public static void main(String[] args) {
        // Creating the binary tree
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        // Printing the boundary nodes of the binary tree
        printBoundary(root);
    }
}

// Using Morris Traversal:

// The basic idea behind the Morris traversal approach is to traverse a binary
// tree in a way that does not use any extra space other than the tree itself.

// The approach uses the fact that each node in a binary tree has a maximum of
// two pointers, which can be used to traverse the tree in a specific manner
// without using any extra space. Specifically, we can modify the structure of
// the tree itself in a way that allows us to traverse it without using any
// extra space.
// Follow the steps below to implement above idea:

// Initialize the current node as the root of the tree.
// While the current node is not null:
// a. If the current node has no left child, print its data and move to its
// right child.
// b. If the current node has a left child:
// i. Find the rightmost node in the left subtree of the current node. This node
// is the inorder predecessor of the current node.
// ii. If the right child of the inorder predecessor is null, set it to the
// current node and move to the left child of the current node.
// iii. If the right child of the inorder predecessor is not null (i.e., it
// points back to the current node), set it to null and print the data of the
// current node. Then move to the right child of the current node.

// Output
// 20 8 4 10 14 25 22
// Time complexity: O(n), where n is the number of nodes in the binary tree.
// Auxiliary Space: O(1)