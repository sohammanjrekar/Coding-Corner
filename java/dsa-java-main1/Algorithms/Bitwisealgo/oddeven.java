package Algorithms.Bitwisealgo;

public class oddeven {
    public static void main(String[] args) {
        oddEvenCheck(4);
        oddEvenCheck(9);
    }

    static void oddEvenCheck(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " Even");
        } else {
            System.out.println(n + " odd");
        }
    }
}
