package Algorithms.Recursion;

import java.util.Scanner;

public class sum_of_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = sum(num);
        System.out.println(ans);
        sc.close();
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        int sum = n + sum(n - 1);
        return sum;
    }
}
