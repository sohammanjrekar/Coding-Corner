package Algorithms.Bitwisealgo;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums=new int[]{3,3,4,1,2,1,2};
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        System.out.println(ans);
    }
}
