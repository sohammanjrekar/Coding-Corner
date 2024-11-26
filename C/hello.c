#include <stdio.h>
int main()
{
    printf("HEllo world! %d \n", printf(" soham "));
    int i;                         // Declared but not initialized
    printf("Value of i: %d\n", i); // Prints a random (garbage) value
    int x = 10;
    typeof(x) y = 20; 
    printf("x: %d, y: %d\n", x, y);
    return 0;
}