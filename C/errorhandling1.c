#include <stdio.h>
#include <setjmp.h>

// Declare a jump buffer to store the program's execution state
jmp_buf buffer;

// Function that will perform a risky operation
void riskyFunction() {
    printf("Inside riskyFunction\n");

    // Simulate an error by jumping back to the last setjmp call
    longjmp(buffer, 1); // Transfers control back to the point where setjmp was called
}

int main() {
    // setjmp saves the current execution context (program state) in buffer
    // It returns 0 when called directly, and a non-zero value when control is transferred back via longjmp
    if (setjmp(buffer) == 0) {
        // This block executes when setjmp is called for the first time
        printf("No error so far.\n");

        // Call a function that might encounter an error
        riskyFunction();
    } else {
        // This block executes when control jumps back to this point using longjmp
        printf("Error occurred!\n");
    }

    return 0;
}
