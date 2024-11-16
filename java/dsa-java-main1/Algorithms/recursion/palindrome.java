package Algorithms.Recursion;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = rev(num);
        System.out.println(ans == num ? true : false);
        sc.close();
    }

    static int rev(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        int digits = (int) Math.log10(n);
        return (int) (rev(n / 10) + rem * Math.pow(10, digits));
    }
}
