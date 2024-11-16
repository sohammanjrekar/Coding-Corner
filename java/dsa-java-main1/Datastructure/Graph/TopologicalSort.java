import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {
        // Create a directed graph as an example
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        // Perform topological sort
        int[] result = topoSort(V, adj);

        // Print the topological sort result
        System.out.println("Topological Sort:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1; // Mark the current node as visited
        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj); // Recursively visit all adjacent nodes
            }
        }
        st.push(node); // Push the current node onto the stack after visiting all its neighbors
    }

    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V]; // Array to keep track of visited nodes
        Stack<Integer> st = new Stack<>(); // Stack to store the topological order

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj); // Perform DFS for each unvisited node
            }
        }

        int[] ans = new int[V]; // Array to store the final topological order
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.peek(); // Pop elements from the stack to get the topological order
            st.pop();
        }
        return ans;
    }
}

// Time complexity: O(V + E)
// The algorithm visits each vertex and edge once, so the time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the visited array and the stack, which in the worst case can go up to the number of vertices, leading to a space complexity of O(V).
