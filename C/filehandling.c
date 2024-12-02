#include <stdio.h>

int main() {
    FILE *f;

    // Opening file in write mode
    f = fopen("m.txt", "w");
    if (f == NULL) { // Check if file opened successfully
        printf("Error opening file!\n");
        return 1; // Exit the program with an error code
    }

    // Writing data to the file
    fprintf(f, "Hello, this is a test file.\n");
    fprintf(f, "This file contains sample data.\n");

    // Closing the file after writing
    fclose(f);

    // Re-opening the file in read mode
    f = fopen("m.txt", "r");
    if (f == NULL) { // Check if file opened successfully
        printf("Error opening file for reading!\n");
        return 1; // Exit the program with an error code
    }

    // Reading and displaying data from the file
    char buffer[100];
    printf("Contents of the file:\n");
    while (fgets(buffer, sizeof(buffer), f) != NULL) {
        printf("%s", buffer);
    }

    // Closing the file after reading
    fclose(f);

    return 0;
}
