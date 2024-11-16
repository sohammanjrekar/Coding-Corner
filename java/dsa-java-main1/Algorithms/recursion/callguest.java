package Algorithms.Recursion;

public class callguest {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callg(n));
    }

    static int callg(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways = callg(n - 1);
        int ways2 = (n - 1) * callg(n - 2);
        return ways + ways2;
    }
}
