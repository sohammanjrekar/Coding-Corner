package Array;

import java.util.*;

public class NumberOfSubarraysWithXorK {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int target=6,count=0;
        // for (int i = 0; i < arr.length; i++) {
        //     int xor=0;
        //     for (int j = i; j < arr.length; j++) {
        //         xor=xor^arr[j];
        //         if(xor==target)  count++;
        //     }
        // }
        // System.out.println(count);

// hashmap : O(n)
        count=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i :arr) {
            if(hm.containsKey(i^target)){
                count++;
            }
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        System.out.println("Number Of subarray : "+count);
    }
}
