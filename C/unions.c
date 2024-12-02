#include <stdio.h>

union Data {
    int i;
    float f;
    char str[20];
};

int main() {
    union Data data;

    data.i = 10;
    printf("data.i: %d\n", data.i);

    data.f = 220.5;
    printf("data.f: %f\n", data.f);

    snprintf(data.str, sizeof(data.str), "Hello");
    printf("data.str: %s\n", data.str);

    // Note: Overwriting happens
    printf("After writing data.str:\n");
    printf("data.i: %d\n", data.i); // Undefined behavior
    printf("data.f: %f\n", data.f); // Undefined behavior
    printf("data.str: %s\n", data.str); // Undefined behavior

    return 0;
}
