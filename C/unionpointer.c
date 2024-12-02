#include <stdio.h>
#include <string.h>

// Define a union with multiple data types
union Data {
    int i;
    float f;
    char str[20];
};

void main(){
    union Data data;
    union Data *dataptr;
    dataptr = &data;
    dataptr->i=5;
    dataptr->f=0.235;
    strcpy(dataptr->str,"Hello, World!");
    printf("Integer: %d\n", dataptr->i);
    printf("Float: %.2f\n", dataptr->f);
    printf("String: %s\n", dataptr->str);
    
}