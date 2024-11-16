package Algorithms.Recursion;

public class TowerOFHanoi {
    static void Towerofhanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk" + n + " from " + source + " to " + destination);
            return;
        }
        Towerofhanoi(n - 1, source, destination, helper);
        System.out.println("transfer disk" + n + " from " + source + " to " + destination);
        Towerofhanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        Towerofhanoi(n, "S", "H", "D");

    }
}