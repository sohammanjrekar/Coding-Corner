package Algorithms.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = factorialnum(num);
        System.out.println(ans);
        sc.close();
    }

    static int factorialnum(int n) {
        if (n <= 1) {
            return 1;
        }
        int factorial1 = n * factorialnum(n - 1);
        return factorial1;
    }
}
