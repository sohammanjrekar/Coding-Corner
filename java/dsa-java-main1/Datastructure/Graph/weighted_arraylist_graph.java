package Graph;

import java.util.ArrayList;

public class weighted_arraylist_graph {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        // Initialize adjacency list with n+1 elements to accommodate 1-based indexing
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Pair>());
        }

        // Adding weighted edge 1---2 with weight 10
        adj.get(1).add(new Pair(2, 10));
        adj.get(2).add(new Pair(1, 10)); // Undirected graph, add edge in both directions

        // Adding weighted edge 2---3 with weight 20
        adj.get(2).add(new Pair(3, 20));
        adj.get(3).add(new Pair(2, 20)); // Undirected graph, add edge in both directions

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int j = 1; j <= n; j++) { // Start from 1 to n for 1-based indexing
            System.out.print(j + ": ");
            for (int k = 0; k < adj.get(j).size(); k++) {
                Pair edge = adj.get(j).get(k);
                System.out.print("(" + edge.node + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    // Pair class to store the node and weight
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}


