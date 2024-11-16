package Tree.BinaryTree;

// Java code to implement the above approach using morris
// traversal Algorithm

// Finding height using Morris Traversal Algorithm:

// The basic idea behind the algorithm is to traverse the left subtree of each node first and then move to its right subtree. During the traversal, we keep track of the maximum depth of the tree by incrementing a counter variable each time we move down a level in the tree.

// Definition of a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
};

public class morris_traversal {
    // Function to find the height of a binary tree using
    // Morris Traversal technique
    public static int findHeight(TreeNode root) {
        int height = 0;
        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                // If left subtree is null, move to right
                // subtree
                current = current.right;
                height++; // Increment the height of the
                          // tree
            } else {
                // Find the inorder predecessor of current
                // node
                TreeNode pre = current.left;
                while (pre.right != null
                        && pre.right != current)
                    pre = pre.right;

                if (pre.right == null) {
                    // Make current node the right child of
                    // its inorder predecessor
                    pre.right = current;
                    current = current.left;
                } else {
                    // If the right child of the inorder
                    // predecessor already points to the
                    // current node, then we have traversed
                    // the left subtree and its inorder
                    // traversal is complete.
                    pre.right = null;
                    current = current.right; // Move to the
                                             // right subtree
                }
            }
        }
        return height;
    }

    // Driver Code
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calculate the height of the tree using Morris
        // Traversal
        int height = findHeight(root);

        // Output the height of the tree
        System.out.println("Height of the binary tree is: "
                + height);
    }
}
// This Code is Contributed by rutikbhosale

// Time Complexity: O(N), The time complexity of finding the height of a binary
// tree using Morris traversal is O(n), where n is the number of nodes in the
// tree.

// Auxiliary Space: O(1), The space complexity of the algorithm is O(1), which
// is constant space complexity. This is because we are not using any additional
// data structures to store nodes or keep track of the traversal