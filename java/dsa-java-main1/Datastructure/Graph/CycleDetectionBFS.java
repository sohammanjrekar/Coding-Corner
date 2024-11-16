import java.util.*;

public class CycleDetectionBFS {

    public static void main(String[] args) {
        // Example 1: Graph with a cycle
        int V1 = 7;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }

        // Adding edges as per the given graph with a cycle
        adj1.get(0).add(1);
        adj1.get(0).add(2);
        adj1.get(1).add(0);
        adj1.get(1).add(4);
        adj1.get(2).add(0);
        adj1.get(2).add(3);
        adj1.get(2).add(5);
        adj1.get(3).add(2);
        adj1.get(4).add(1);
        adj1.get(4).add(6);
        adj1.get(5).add(2);
        adj1.get(5).add(6);
        adj1.get(6).add(4);
        adj1.get(6).add(5);

        System.out.println("Example 1: " + (detectCycle(V1, adj1) ? "Cycle present" : "No cycle present"));

        // Example 2: Graph without a cycle
        int V2 = 4;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }

        // Adding edges as per the given graph without a cycle
        adj2.get(0).add(1);
        adj2.get(0).add(2);
        adj2.get(1).add(0);
        adj2.get(1).add(3);
        adj2.get(2).add(0);
        adj2.get(3).add(1);

        System.out.println("Example 2: " + (detectCycle(V2, adj2) ? "Cycle present" : "No cycle present"));
    }

    // Function to detect a cycle in an undirected graph using BFS
    public static boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // Array to keep track of visited nodes
        boolean cycleFound = false; // Flag to indicate if a cycle is found

        // Iterate through each vertex
        for (int i = 0; i < V; i++) {
            // If the vertex is not visited, check for a cycle starting from that vertex
            if (!visited[i]) {
                if (checkCycle(adj, visited, i)) {
                    cycleFound = true; // Cycle found
                    break; // Exit loop as cycle is detected
                }
            }
        }
        return cycleFound; // Return whether a cycle is found
    }

    // Helper function to check for a cycle using BFS
    private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int src) {
        Queue<Pair> queue = new LinkedList<>(); // Queue for BFS
        queue.add(new Pair(src, -1)); // Add the source node with no parent
        visited[src] = true; // Mark the source node as visited

        // Perform BFS
        while (!queue.isEmpty()) {
            Pair node = queue.poll(); // Dequeue a node
            int currentNode = node.first; // Get the current node
            int parent = node.second; // Get the parent of the current node

            // Iterate through all the adjacent nodes
            for (int neighbor : adj.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark the neighbor as visited
                    queue.add(new Pair(neighbor, currentNode)); // Add the neighbor to the queue
                } else if (neighbor != parent) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle detected
    }
}

// Helper class to store a node and its parent during BFS
class Pair {
    int first; // Node
    int second; // Parent of the node

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

// Time complexity: O(V + E)
// The algorithm visits each vertex and edge once, so the time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the visited array and the queue, which in the worst case can hold all vertices, leading to a space complexity of O(V).
