package Algorithms.Recursion;

public class place_titles_on_nm {
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(tiles(n, m));
    }

    private static int tiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int vertplacement = tiles(n - m, m);
        int horizontal = tiles(n - 1, m);
        return vertplacement + horizontal;
    }
}
