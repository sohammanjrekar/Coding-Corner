#include <stdlib.h>
#include <stdio.h>
#include <string.h>
struct car
{
    char brand[50];
    int year;
    float price;
};

void main(){
struct car c1;
strcpy(c1.brand, "Toyota");
    c1.year = 2021;
    c1.price = 25000.00;
    printf("%s %d %f", c1.brand, c1.year, c1.price);
    }