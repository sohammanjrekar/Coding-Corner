import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    Graph() {
        adjList = new HashMap<>();
    }

    void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    List<Integer> getNeighbors(int u) {
        return adjList.getOrDefault(u, new ArrayList<>());
    }

    void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (int neighbor : adjList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
