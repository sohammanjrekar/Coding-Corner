package Algorithms.Bitwisealgo;

public class xor_for_range {
    public static void main(String[] args) {
        int start=1; 
        int n=9;
       if(n%4==1) System.out.println(1);
       else if(n%4==2) System.out.println(n+1);
       else if (n%4==3) System.out.println(0);
       else if (n%4==0) System.out.println(n);
    }
}
