#include <stdio.h>

struct car {
    char brand[50];
    int year;
    float price;
};

void main() {
    struct car arr[5]; // Declare an array of 5 'car' structures
    
    // Example of populating the array
    for (int i = 0; i < 5; i++) {
        printf("Enter details for car %d:\n", i + 1);
        printf("Brand: ");
        scanf("%s", arr[i].brand);
        printf("Year: ");
        scanf("%d", &arr[i].year);
        printf("Price: ");
        scanf("%f", &arr[i].price);
    }

    // Display the car details
    printf("\nDetails of the cars entered:\n");
    for (int i = 0; i < 5; i++) {
        printf("Car %d:\n", i + 1);
        printf("Brand: %s, Year: %d, Price: %.2f\n", arr[i].brand, arr[i].year, arr[i].price);
    }
}
