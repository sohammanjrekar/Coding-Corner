package Graph;

import java.util.ArrayList;

public class graph_arraylist {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list with n+1 elements to accommodate 1-based indexing
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1); // Undirected graph, add edge in both directions

        // Adding edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2); // Undirected graph, add edge in both directions

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int j = 1; j <= n; j++) { // Start from 1 to n for 1-based indexing
            System.out.print(j + ": ");
            for (int k = 0; k < adj.get(j).size(); k++) {
                System.out.print(adj.get(j).get(k) + " ");
            }
            System.out.println();
        }
    }
}
