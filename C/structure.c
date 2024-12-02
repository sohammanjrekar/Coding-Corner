#include <stdlib.h>
#include <stdio.h>
#include <string.h>
struct car
{
   
    int year;
    float price;
};

void main(){
struct car c1;

    c1.year = 2021;
    c1.price = 25000.00;
    printf(" %d %f",  c1.year, c1.price);
    

    struct car c2={2023,260000};
    printf("\n%d  %f", c2.year, c2.price);
    }
