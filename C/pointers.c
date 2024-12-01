#include <stdio.h>
int main()
{
    printf("HEllo world!");
    int* ptr =NULL;
    int** ptr1=NULL;
    int i=5;
    ptr=&i;
    ptr1=&ptr;
    printf("Value at ptr: %x  %u %u %d \n",ptr,*ptr,ptr1,**ptr1);
    return 0;
}