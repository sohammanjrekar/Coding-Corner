package Graph;

import java.util.*;

public class dfssimple {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edges
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(6);
        adj.get(6).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(6).add(7);
        adj.get(7).add(6);

        adj.get(6).add(8);
        adj.get(8).add(6);

        adj.get(4).add(5);
        adj.get(5).add(4);

        adj.get(7).add(5);
        adj.get(5).add(7);

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int j = 1; j <= n; j++) { // Start from 1 to n for 1-based indexing
            System.out.print(j + ": ");
            for (int k : adj.get(j)) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int[] vis = new int[n + 1];
        dfsmy(adj, vis, 6); // Perform DFS starting from node 1
    }

    // DFS function
    public static void dfsmy(ArrayList<ArrayList<Integer>> adj, int[] vis, int curr) {
        // Mark the current node as visited
        vis[curr] = 1;
        System.out.print(curr + " "); // Print the current node

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adj.get(curr)) {
            if (vis[neighbor] == 0) { // If the neighbor has not been visited
                dfsmy(adj, vis, neighbor);
            }
        }
    }
}






























