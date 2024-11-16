package Algorithms.Recursion;

import java.util.Scanner;

public class multiple_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = sumd(num);
        System.out.println(ans);
        sc.close();
    }

    static int sumd(int n) {
        if (n % 10 == n) {
            return n;
        }
        return sumd(n / 10) * (n % 10);
    }
}
