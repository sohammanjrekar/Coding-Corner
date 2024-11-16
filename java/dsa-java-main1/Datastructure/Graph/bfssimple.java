package Graph;

import java.util.*;

public class bfssimple {
    public static void main(String[] args) {
        int n=8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1); // Undirected graph, add edge in both directions

        // Adding edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2); // Undirected graph, add edge in both directions
 // Adding edge 1---6
 adj.get(1).add(6);
 adj.get(6).add(1); // Undirected graph, add edge in both directions

 // Adding edge 2---4
 adj.get(2).add(4);
 adj.get(4).add(2); // Undirected graph, add edge in both directions
 // Adding edge 6---7
 adj.get(6).add(7);
 adj.get(7).add(6); // Undirected graph, add edge in both directions

 // Adding edge 6---8
 adj.get(6).add(8);
 adj.get(8).add(6); // Undirected graph, add edge in both directions
 // Adding edge 4---5
 adj.get(4).add(5);
 adj.get(5).add(4); // Undirected graph, add edge in both directions

 // Adding edge 7---5
 adj.get(7).add(5);
 adj.get(5).add(7); // Undirected graph, add edge in both directions

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int j = 1; j <= n; j++) { // Start from 1 to n for 1-based indexing
            System.out.print(j + ": ");
            for (int k = 0; k < adj.get(j).size(); k++) {
                System.out.print(adj.get(j).get(k) + " ");
            }
            System.out.println();
        }
        bfsmy(adj,n,6);

    }


    public static void bfsmy(ArrayList<ArrayList<Integer>> adj, int n, int start) {
        boolean[] vis = new boolean[n + 1]; // Visited array to keep track of visited nodes
        Queue<Integer> q = new LinkedList<>();
        vis[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int neighbor : adj.get(curr)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
