package Algorithms.Recursion;

import java.util.Scanner;

public class count_zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(zeros(num));
        sc.close();
    }

    static int zeros = 0;

    static int zeros(int n) {

        if (n % 10 == 0) {
            zeros += 1;
        }
        if (n % 10 == n) {
            return zeros;
        }
        return zeros(n / 10);
    }
}
