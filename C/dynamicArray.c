#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;

    // Ask the user for the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    // Dynamically allocate memory using calloc
    int *arr = calloc(n, sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // All elements are initialized to 0 by calloc
    printf("Initial values in the array (all zeros):\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Input elements into the array
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Display the elements of the array
    printf("The elements in the array are:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Resize the array using realloc
    int new_size;
    printf("Enter the new size of the array: ");
    scanf("%d", &new_size);

    arr = realloc(arr, new_size * sizeof(int));
    if (arr == NULL) {
        printf("Memory reallocation failed\n");
        return 1;
    }

    // Initialize new elements to zero if the array size has increased
    if (new_size > n) {
        for (int i = n; i < new_size; i++) {
            arr[i] = 0; // New elements initialized to 0
        }
    }

    // Display the resized array
    printf("The elements in the resized array are:\n");
    for (int i = 0; i < new_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Free the dynamically allocated memory
    free(arr);

    return 0;
}
