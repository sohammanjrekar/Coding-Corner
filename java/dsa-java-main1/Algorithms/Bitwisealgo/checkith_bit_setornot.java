package Algorithms.Bitwisealgo;

public class checkith_bit_setornot {
    public static void main(String[] args) {
        int n= 11, i = 2;
        if(((n>>2)&1)==1) System.out.println("set");
        else System.out.println("not set");
    }
}
