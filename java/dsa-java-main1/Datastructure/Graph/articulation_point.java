package Graph;

import java.util.ArrayList;

public class articulation_point {
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
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));

    }

    public static void getAriticulationPoint(ArrayList<edge> graph[], int v) {
        int discory_time[] = new int[v];
        int low_discorytime[] = new int[v];
        int time = 0;
        boolean visited[] = new boolean[v];
        boolean ap[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(graph, i, -1, discory_time, low_discorytime, visited, time, ap);
            }
        }
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("Ap: " + i);
            }
        }
    }

    static void dfs(ArrayList<edge>[] graph, int curr, int parent, int[] discory_time,
            int[] low_discorytime, boolean[] visited, int time, boolean[] ap) {
        visited[curr] = true;
        discory_time[curr] = low_discorytime[curr] = ++time;
        int children = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            int neighbour = e.destination;
            if (neighbour == parent) {
                continue;
            } else if (!visited[neighbour]) {
                low_discorytime[curr] = Math.min(low_discorytime[curr], discory_time[neighbour]);
            } else {
                dfs(graph, neighbour, curr, discory_time, low_discorytime, visited, time, ap);
                low_discorytime[curr] = Math.min(low_discorytime[curr], low_discorytime[neighbour]);
                if (discory_time[curr] <= low_discorytime[neighbour] && parent != -1) {
                    ap[curr] = true;
                }
                children++;
            }

        }
        if (parent == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        getAriticulationPoint(graph, v);
    }
}
