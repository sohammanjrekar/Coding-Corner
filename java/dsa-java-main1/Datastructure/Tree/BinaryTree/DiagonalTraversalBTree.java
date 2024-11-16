package Tree.BinaryTree;

// Java Code for above approach
import java.util.*;

// Tree node
class Node {
    int data;
    Node left, right;
};

class BinaryTree {

    public static List<Integer> diagonal(Node root) {
        List<Integer> diagonalVals = new ArrayList<>();
        if (root == null)
            return diagonalVals;

        // The leftQueue will be a queue which will store
        // all left pointers while traversing the tree, and
        // will be utilized when at any point right pointer
        // becomes NULL

        Queue<Node> leftQueue = new LinkedList<>();
        Node node = root;

        while (node != null) {

            // Add current node to output
            diagonalVals.add(node.data);
            // If left child available, add it to queue
            if (node.left != null)
                leftQueue.add(node.left);

            // if right child, transfer the node to right
            if (node.right != null)
                node = node.right;
            else {
                // If left child Queue is not empty, utilize
                // it to traverse further
                if (!leftQueue.isEmpty()) {
                    node = leftQueue.peek();
                    leftQueue.remove();
                } else {
                    // All the right childs traversed and no
                    // left child left
                    node = null;
                }
            }
        }
        return diagonalVals;
    }

    // Utility method to create a new node
    public static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return node;
    }

    // Driver program
    public static void main(String[] args) {

        Node root = newNode(8);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(1);
        root.left.right = newNode(6);
        root.right.right = newNode(14);
        root.right.right.left = newNode(13);
        root.left.right.left = newNode(4);
        root.left.right.right = newNode(7);

        /*
         * Node* root = newNode(1);
         * root->left = newNode(2);
         * root->right = newNode(3);
         * root->left->left = newNode(9);
         * root->left->right = newNode(6);
         * root->right->left = newNode(4);
         * root->right->right = newNode(5);
         * root->right->left->right = newNode(7);
         * root->right->left->left = newNode(12);
         * root->left->right->left = newNode(11);
         * root->left->left->right = newNode(10);
         */

        List<Integer> diagonalValues = diagonal(root);
        for (int i = 0; i < diagonalValues.size(); i++) {
            System.out.print(diagonalValues.get(i) + " ");
        }
        System.out.println();
    }
}

// This code is contributed by Tapesh(tapeshdua420)
