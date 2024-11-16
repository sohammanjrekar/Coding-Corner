package Algorithms.Bitwisealgo;

public class Remove_last_set_bit {
    public static void main(String[] args) {
        int n=12;
        // for (int i = 0; i < 32; i++) {
        //     if(((n>>i)&1)==1){
        //         n=n&~(1<<i);
        //         break;
        //     }
        // }
        n = n & (n - 1); // Remove the last set bit
        System.out.println(n);
    }
}
