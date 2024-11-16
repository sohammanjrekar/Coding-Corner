package Algorithms.Bitwisealgo;

public class bitOperations {
    public static void main(String[] args) {
//fyg
        System.out.println(getIthbit(10, 1));
        System.out.println(setIthbit(10, 1));
        System.out.println(clearIthbit(15,2));
        System.out.println(updateIthbit(10, 1));
    }

    private static int updateIthbit(int n, int i) {
        if (i == 0) {
            return clearIthbit(n, i);
        } else {
            return setIthbit(n, i);
        }
    }

    private static int clearIthbit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;

    }

    private static int setIthbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    private static int getIthbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }
}
