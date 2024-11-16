package Graph;
import java.util.*;

public class kahnalgo {

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
        List<Integer> result = topoSort(V, adj);

        // Print the topological sort result
        System.out.println("Topological Sort:");
        if (result == null) {
            System.out.println("Cycle detected, topological sort not possible.");
        } else {
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
    }

    public static List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V];
        List<Integer> topoOrder = new ArrayList<>();

        // Compute in-degrees of all vertices
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        // Initialize a queue and enqueue all vertices with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Process vertices in the queue
        while (!queue.isEmpty()) {
            int current = queue.poll();
            topoOrder.add(current);

            for (int neighbor : adj.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Check if topological sort is possible
        if (topoOrder.size() != V) {
            return null; // Cycle detected, topological sort not possible
        }
        return topoOrder;
    }
}

// Time complexity: O(V + E)
// The algorithm processes each vertex and edge once, leading to a time complexity of O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the in-degree array, the queue, and the topological order list, resulting in a space complexity of O(V).
