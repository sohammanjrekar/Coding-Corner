#include <stdio.h>

int main() {
    // Initialize the variable
    int num = 0;

    // Prompt the user for input
    printf("Enter a number: ");
    
    // Read input and handle errors
    if (scanf("%d", &num) != 1) { // Check if input is an integer
        printf("Invalid input! Please enter a valid number.\n");
        
        // Clear input buffer (to handle invalid inputs)
        while (getchar() != '\n');
        return 1; // Exit the program with an error code
    }

    // Display the entered number
    printf("You entered: %d\n", num);

    // Clear the input buffer (after reading the integer)
    while (getchar() != '\n');

    // Without spaces string input
    char str[50];
    printf("Enter a string (no spaces): ");
    scanf("%s", str); // Reads a single word (no spaces)
    printf("You entered: %s\n", str);

    // With spaces string input
    char str1[50];
    printf("Enter a string (with spaces): ");
    fgets(str1, sizeof(str1), stdin); // Reads a line of text (including spaces)
    printf("You entered: %s", str1);

    return 0; // Standard return value for successful execution
}
