package Algorithms.Recursion;

public class recursion {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n) {

        if (n == 5) {
            System.out.println("hello world");
            return;
        }

        message(n + 1);
        System.out.println(n);

    }
}
