
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int ans =linearsearch(arr, target);
        System.out.println("Index of target: "+ans);
        in.close();

    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
       
            for(int index=0;index<arr.length;index++){
                if(arr[index]==target){
                    return index;
                }
            }
        return -1;
    }
}
