package Algorithms.Recursion;

public class maze_path {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(maze(n, m, 0, 0));

    }

    private static int maze(int n, int m, int i, int j) {
        if (n == i || m == j) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int down_paths = maze(n, m, i + 1, j);
        int right_paths = maze(n, m, i, j + 1);
        return down_paths + right_paths;
    }

}
