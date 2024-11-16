package Graph;

import java.util.ArrayList;

public class cycledetection {
    static class edge {
        int source;
        int destination;

        public edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 0));
    }

    public static boolean iscycledirected(ArrayList<edge> graph[], boolean visited[], int curr,
            boolean recursivestack[]) {
        visited[curr] = true;
        recursivestack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (recursivestack[e.destination]) {
                return true;
            } else if (!visited[e.destination] && iscycledirected(graph, visited, e.destination, recursivestack)) {
                return true;
            }

        }

        recursivestack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        boolean visited[] = new boolean[v];
        boolean recursivestack[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                System.out.println(iscycledirected(graph, visited, 0, recursivestack));
            }
        }
    }
}
