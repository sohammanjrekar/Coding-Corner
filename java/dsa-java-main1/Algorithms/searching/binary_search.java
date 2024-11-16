import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int ans =binarysearch(arr, target);
        System.out.println("Index of target: "+ans);
        in.close();
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]<target){
start=mid+1;
            }
            else if(arr[mid]>target){
end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    }
