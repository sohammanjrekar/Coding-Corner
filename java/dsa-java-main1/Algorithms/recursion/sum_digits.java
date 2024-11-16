package Algorithms.Recursion;

import java.util.Scanner;

public class sum_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = sumd(num);
        System.out.println(ans);
        sc.close();
    }

    static int sumd(int n) {
        if (n == 0) {
            return 1;
        }
        return sumd(n / 10) + (n % 10);
    }
}
