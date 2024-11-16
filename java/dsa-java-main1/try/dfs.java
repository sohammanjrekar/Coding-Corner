
    import java.util.*;

class Solution12 {
    // Depth-First Search (DFS)
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // Visit the current node
        System.out.print(root.val + " ");
        
        // Recursively visit left and right subtrees
        dfs(root.left);
        dfs(root.right);
    }
    public static void main(String[] args) {
        // Construct the binary tree: [1,2,3,4,5,6,7]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        // Create an instance of Solution
        Solution12 solution = new Solution12();
        
        // Demonstrate DFS
        System.out.println("Depth-First Search (DFS):");
        solution.dfs(root);
        System.out.println(); // New line for clarity
        
}

}
