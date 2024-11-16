import java.util.*;

public class BipartiteCheckDFS {

    public static void main(String[] args) {
        // Example 1: Bipartite graph
        int V1 = 4;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }
        adj1.get(0).add(1);
        adj1.get(1).add(0);
        adj1.get(1).add(2);
        adj1.get(2).add(1);
        adj1.get(2).add(3);
        adj1.get(3).add(2);
        System.out.println("Graph representation for Example 1:");
        printGraph(adj1);
        System.out.println("Example 1: " + (isBipartite(V1, adj1) ? "Graph is bipartite" : "Graph is not bipartite"));

        // Example 2: Non-bipartite graph
        int V2 = 3;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }
        adj2.get(0).add(1);
        adj2.get(1).add(0);
        adj2.get(1).add(2);
        adj2.get(2).add(1);
        adj2.get(2).add(0);
        adj2.get(0).add(2);
        System.out.println("Graph representation for Example 2:");
        printGraph(adj2);
        System.out.println("Example 2: " + (isBipartite(V2, adj2) ? "Graph is bipartite" : "Graph is not bipartite"));
    }

    // Function to check if a graph is bipartite using DFS
    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V]; // Array to store colors of vertices
        Arrays.fill(color, -1); // Initialize all vertices as uncolored
        
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) { // If the vertex is not colored
                if (!dfs(adj, i, color, 0)) {
                    return false; // If graph is not bipartite
                }
            }
        }
        return true; // If graph is bipartite
    }
    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    // Helper function to perform DFS and color the graph
    private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, int[] color, int col) {
        color[node] = col; // Color the current node
        
        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == -1) { // If the neighbor is not colored
                // Recursively call dfs for the uncolored neighbor with the opposite color
                if (!dfs(adj, neighbor, color, 1 - col)) {
                    return false;
                }
            } else if (color[neighbor] == color[node]) { // If the neighbor has the same color
                return false; // Graph is not bipartite
            }
        }
        return true;
    }
}

// Time complexity: O(V + E)
// The algorithm processes each vertex and edge once, leading to a time complexity of O(V + E), where V is the number of vertices and E is the number of edges.

// Space complexity: O(V)
// The algorithm uses additional space for the color array and the recursion stack, resulting in a space complexity of O(V).
