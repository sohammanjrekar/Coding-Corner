#include <stdio.h>
void swap(int a[]){
    int temp=a[0];
    a[0]=a[1];
    a[1]=temp;
}
int main()
{
  int arr[] = {1, 2, 3, 4};  // Correct array declaration
 // Example of accessing the array elements
    for (int i = 0; i < 4; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
    swap(arr);
     // Example of accessing the array elements
    for (int i = 0; i < 4; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }

   return 0;
}