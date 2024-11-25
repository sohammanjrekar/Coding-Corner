#include <stdio.h>
#include <stdlib.h> // For exit()
void main()
{

    // Second loop with break, continue, and goto
    for (int i = 0; i < 5; i++)
    {
        if (i == 4)
        {
            break; // Exit the loop when i == 4
        }
        if (i == 2)
        {
            goto Label; // Jump to the label

            continue; // Skip printing when i == 2
        }
        printf(" %d ", i);
    }
    // Define the label
Label:
    for (int j = 0; j < 3; j++)
    {
        printf(" %d ", j);
        exit(0);
    }
}
