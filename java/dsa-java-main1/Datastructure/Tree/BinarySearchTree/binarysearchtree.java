package Tree.BinarySearchTree;
// Java program to demonstrate

// insert operation in binary

// search tree

public class binarysearchtree {

    // Class containing left
    // and right child of current node
    // and key value
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    binarysearchtree() {
        root = null;
    }

    binarysearchtree(int value) {
        root = new Node(value);
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to
    // insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        binarysearchtree tree = new binarysearchtree();

        /*
         * Let us create following BST
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal of the BST
        tree.inorder();
    }

}
// Java code to implement the insertion
// in binary search tree

// import java.io.*;
// import java.util.*;

// class GFG {

// // Driver code
// public static void main(String[] args)
// {
// BST tree = new BST();
// tree.insert(30);
// tree.insert(50);
// tree.insert(15);
// tree.insert(20);
// tree.insert(10);
// tree.insert(40);
// tree.insert(60);

// tree.inorder();
// }
// }

// class Node {
// Node left;
// int val;
// Node right;
// Node(int val) { this.val = val; }
// }

// class BST {
// Node root;

// // Function to insert a key
// public void insert(int key)
// {
// Node node = new Node(key);
// if (root == null) {
// root = node;
// return;
// }
// Node prev = null;
// Node temp = root;
// while (temp != null) {
// if (temp.val > key) {
// prev = temp;
// temp = temp.left;
// }
// else if (temp.val < key) {
// prev = temp;
// temp = temp.right;
// }
// }
// if (prev.val > key)
// prev.left = node;
// else prev.right=node;}

// // Function to print the inorder value
// public void inorder() {
// Node temp = root;
// Stack<Node> stack = new Stack<>();
// while (temp != null || !stack.isEmpty()) {
// if (temp != null) {
// stack.add(temp);
// temp = temp.left;
// } else {
// temp = stack.pop();
// System.out.print(temp.val + " ");
// temp = temp.right;
// }
// }
// }
// }
