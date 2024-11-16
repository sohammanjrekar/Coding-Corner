package Algorithms.Bitwisealgo;

public class swapTwoNum {
    public static void main(String[] args) {
        int a=5,b=6;
        
        System.out.println("Value of A:"+a+" : "+"Value of B:" +" : "+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Value of A:"+a+" : "+"Value of B:" +" : "+b);
    }

   
}
