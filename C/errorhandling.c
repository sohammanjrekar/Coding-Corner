#include <stdio.h>
#include <errno.h>
#include <string.h>

int main() {
    FILE *f = fopen("nonexistent.txt", "r");
    if (f == NULL) {
        printf("Error opening file: %s\n", strerror(errno));
    }
    return 0;
}
