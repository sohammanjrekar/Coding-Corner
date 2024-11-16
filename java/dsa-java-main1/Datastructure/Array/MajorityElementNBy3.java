package Array;

import java.util.*;

public class MajorityElementNBy3 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,3,3,2,2,2};
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        // brute force: O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        //     int count=0;
        //     for (int j = i; j < arr.length; j++) {
        //         if(arr[i]==arr[j]) count++;
        //         if(count>(n/3)) {ans.add(arr[i]);break;}
        //     }
        // }
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n / 3) {
                ans.add(entry.getKey());
            }
        }
        // moore algo

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // Step 1: Find potential candidates
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            ans.add(candidate1);
        }
        if (count2 > n / 3) {
            ans.add(candidate2);
        }
        System.out.println(ans);
    }
}
