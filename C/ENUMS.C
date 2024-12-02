#include <stdio.h>

// Define an enum for car brands
enum car {
    toyota = 0,  // Assign 0 to toyota
    maruti = 5   // Assign 5 to maruti
};

int main() {
    // Declare an enum variable
    enum car myCar;

    // Assign a value to the enum variable
    myCar = toyota;

    // Print the value of the enum variable
    printf("My car brand is toyota with value: %d\n", myCar);

    // Assign another value to the enum variable
    myCar = maruti;

    // Print the value of the enum variable
    printf("My car brand is maruti with value: %d\n", myCar);

    return 0;
}
