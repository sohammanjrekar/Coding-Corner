#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main()
{
    int *ptr;
    char *str;

    // Allocating memory for 5 integers using malloc
    ptr = malloc(5 * sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return;
    }
    for (int i = 0; i < 5; i++)
    {
        ptr[i] = i + 1; // Assigning values for demonstration
        printf("Value at position %d is %d\n", i + 1, ptr[i]);
    }

    // Free the allocated memory
    free(ptr);
    printf("\n");

    // Allocating memory for 5 integers using calloc
    ptr = calloc(5, sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return;
    }
    for (int i = 0; i < 5; i++)
    {
        printf("Value at position %d is %d\n", i + 1, ptr[i]);
    }
    printf("\n");

    // Reallocate the memory block to hold 10 integers
    ptr = realloc(ptr, 10 * sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory reallocation failed\n");
        return;
    }
    for (int i = 5; i < 10; i++)
    {
        ptr[i] = i + 1; // Assigning values for the new positions
    }
    for (int i = 0; i < 10; i++)
    {
        printf("Value at position %d is %d\n", i + 1, ptr[i]);
    }

    // Free the reallocated memory
    free(ptr);
    printf("\n");

    // Allocating memory for a string
    str = malloc(50 * sizeof(char)); // Allocating memory for a string of 49 characters (+1 for '\0')
    if (str == NULL)
    {
        printf("Memory allocation for string failed\n");
        return;
    }

    // Assigning a string value
    strcpy(str, "Hello, dynamically allocated string!");
    printf("String: %s\n", str);

    // Reallocate memory for a larger string
    str = realloc(str, 100 * sizeof(char)); // Increasing memory for a longer string
    if (str == NULL)
    {
        printf("Memory reallocation for string failed\n");
        return;
    }

    // Append to the string
    strcat(str, " And now it's extended.");
    printf("Updated String: %s\n", str);

    // Free the string memory
    free(str);
}
