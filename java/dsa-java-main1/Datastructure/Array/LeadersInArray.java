package Array;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        // Queue<Integer> ans = new LinkedList<>();
        
        // for (int i = 0; i < arr.length; i++) {
        //     boolean isLeader = true; // Reset isLeader for each element
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             isLeader = false; // arr[i] is not a leader
        //             break;
        //         }
        //     }
        //     if (isLeader) {
        //         ans.add(arr[i]); // Add to leaders list if arr[i] is a leader
        //     }
        // }
        
        // System.out.println(ans);
        List<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);
    }
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        // Step 1: Traverse the array from right to left
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); // The rightmost element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            // Step 2: If the current element is greater than the maxFromRight,
            // it's a leader
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Step 3: Reverse the list to maintain the original order
        Collections.reverse(leaders);
        return leaders;
    }
}
