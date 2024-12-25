import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergesorts(arr,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesorts(int[] arr,int left,int right){
        if(left<right){
            int mid = left + (right - left) / 2;
            mergesorts(arr,left,mid);
            mergesorts(arr,mid+1,right);
            merge(arr,left,mid,right);
        }

    }

    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarr=new int[n1];
        int[] rightarr=new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i]=arr[left+i];
        }
        for (int i = 0; i < n2; i++) {
            rightarr[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
            }else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
     }
}
