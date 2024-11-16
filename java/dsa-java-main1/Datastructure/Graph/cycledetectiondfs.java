import java.util.*;

public class cycledetectiondfs {

    public static void main(String[] args) {
        System.out.println("Example 1: " + (detectCycle(7, createGraph1()) ? "Cycle present" : "No cycle present"));
        System.out.println("Example 2: " + (detectCycle(4, createGraph2()) ? "Cycle present" : "No cycle present"));
    }

    // Function to create the first graph with a cycle
    private static ArrayList<ArrayList<Integer>> createGraph1() {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).addAll(Arrays.asList(1, 2));
        adj.get(1).addAll(Arrays.asList(0, 4));
        adj.get(2).addAll(Arrays.asList(0, 3, 5));
        adj.get(3).add(2);
        adj.get(4).addAll(Arrays.asList(1, 6));
        adj.get(5).addAll(Arrays.asList(2, 6));
        adj.get(6).addAll(Arrays.asList(4, 5));
        return adj;
    }

    // Function to create the second graph without a cycle
    private static ArrayList<ArrayList<Integer>> createGraph2() {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).addAll(Arrays.asList(1, 2));
        adj.get(1).addAll(Arrays.asList(0, 3));
        adj.get(2).add(0);
        adj.get(3).add(1);
        return adj;
    }

    // Function to detect a cycle in an undirected graph using DFS
    public static boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // Array to keep track of visited nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i] && checkCycle(adj, visited, i, -1)) return true;
        }
        return false;
    }

    // Helper function to check for a cycle using DFS
    private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, int parent) {
        visited[node] = true; // Mark the current node as visited

        // Iterate through all the adjacent nodes
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                // Recursively call checkCycle for the unvisited neighbor
                if (checkCycle(adj, visited, neighbor, node)) return true;
            } else if (neighbor != parent) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected
    }
}

// Time complexity: O(V + E)
// The algorithm visits each vertex and edge once, so the time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the visited array and the recursion stack, which in the worst case can go up to the number of vertices, leading to a space complexity of O(V).
