package Graph;

import java.util.ArrayList;

//bridges in graph
public class tarjonsalgo {
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
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));

    }

    public static void tarjons(ArrayList<edge> graph[], int v) {
        int discory_time[] = new int[v];
        int low_discorytime[] = new int[v];
        int time = 0;
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, discory_time, low_discorytime, time, -1);
            }
        }
    }

    private static void dfs(ArrayList<edge>[] graph, int curr, boolean[] visited, int[] discory_time,
            int[] low_discorytime, int time, int parent) {
        visited[curr] = true;
        discory_time[curr] = low_discorytime[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (e.destination == parent) {
                continue;
            } else if (!visited[e.destination]) {
                dfs(graph, e.destination, visited, discory_time, low_discorytime, time, curr);
                low_discorytime[curr] = Math.min(low_discorytime[curr], low_discorytime[e.destination]);
                if (discory_time[curr] < low_discorytime[e.destination]) {
                    System.out.println("Bridge is :" + curr + "----" + e.destination);
                }
            } else {
                low_discorytime[curr] = Math.min(low_discorytime[curr], discory_time[e.destination]);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        tarjons(graph, v);
    }
}
