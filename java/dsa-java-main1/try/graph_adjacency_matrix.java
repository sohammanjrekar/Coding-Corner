package Graph;


// time and space compity o(n^2)

class graph_adjacency_matrix {
    public static void main(String[] args) {
        // Define the number of nodes (n) and edges (m) in the graph
        int n = 3;

        // Initialize the adjacency matrix with dimensions (n+1) x (n+1)
        // We use (n+1) to make the matrix 1-indexed for easier access based on problem requirements
        int[][] adj = new int[n + 1][n + 1];

        // Adding an edge between node 1 and node 2
        adj[1][2] = 1; // if not weighted then 1 ,otherwise add weight
        adj[2][1] = 1; // Because this is an undirected graph, we need to add the edge in both directions

        // Adding an edge between node 2 and node 3
        adj[2][3] = 1;
        adj[3][2] = 1; // Again, add the edge in both directions

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
