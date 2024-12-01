#include <stdio.h>
void swap(int* x, int* y){
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
    return;
}
int main()
{
   int a=0,b=1;
   printf("Before swapping: a = %d, b = %d", a, b);
   swap(&a,&b);
   printf("\n");
   printf("After swapping: a = %d, b = %d", a, b);
   return 0;
}