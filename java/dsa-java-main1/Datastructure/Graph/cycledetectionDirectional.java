import java.util.*;
public class cycledetectionDirectional {

    public static void main(String[] args) {
        System.out.println("Example 1: " + (detectCycle(4, createGraph1()) ? "Cycle present" : "No cycle present"));
        System.out.println("Example 2: " + (detectCycle(4, createGraph2()) ? "Cycle present" : "No cycle present"));
    }

    // Function to create the first directed graph with a cycle
    private static ArrayList<ArrayList<Integer>> createGraph1() {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).addAll(Arrays.asList(1));
        adj.get(1).addAll(Arrays.asList(2));
        adj.get(2).addAll(Arrays.asList(3));
        adj.get(3).addAll(Arrays.asList(1)); // Creating a cycle
        return adj;
    }

    // Function to create the second directed graph without a cycle
    private static ArrayList<ArrayList<Integer>> createGraph2() {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).addAll(Arrays.asList(1));
        adj.get(1).addAll(Arrays.asList(2));
        adj.get(2).addAll(Arrays.asList(3));
        // No cycle in this graph
        return adj;
    }

    // Function to detect a cycle in a directed graph using DFS
    public static boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // Array to keep track of visited nodes
        boolean[] pathVis = new boolean[V]; // Array to keep track of the current path

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (checkCycle(adj, visited, pathVis, i)) return true;
            }
        }
        return false;
    }

    // Helper function to check for a cycle using DFS
    private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] pathVis, int node) {
        visited[node] = true; // Mark the current node as visited
        pathVis[node] = true; // Mark the current node as part of the current path

        // Iterate through all the adjacent nodes
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                // Recursively call checkCycle for the unvisited neighbor
                if (checkCycle(adj, visited, pathVis, neighbor)) return true;
            } else if (pathVis[neighbor]) {
                return true; // Cycle detected
            }
        }

        pathVis[node] = false; // Unmark the current node from the current path
        return false; // No cycle detected
    }
}

// Time complexity: O(V + E)
// The algorithm visits each vertex and edge once, so the time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the visited array, the pathVis array, and the recursion stack, which in the worst case can go up to the number of vertices, leading to a space complexity of O(V).

