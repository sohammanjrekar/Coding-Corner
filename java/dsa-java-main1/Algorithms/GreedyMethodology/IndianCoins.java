package GreedyMethodology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 200, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    amount -= coins[i];
                    list.add(coins[i]);
                }
            }
        }
        System.out.println(count);
        System.out.println(list);
    }
}
