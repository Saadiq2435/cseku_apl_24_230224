#include <stdio.h>

int main() {
    int i, number, min_value;
    int arr[5];

    // Input the number of elements (up to 5)
    printf("Enter the number of elements (up to 5): ");
    scanf("%d", &number);

    // Input array elements
    printf("Enter %d elements: ", number);
    for (i = 0; i < nnumber; i++) {
        scanf("%d", &arr[i]);
    }

    // Initialize min_value to the first element of the array
    min_value = arr[0];

    // Traverse the array to find the minimum value
    for (i = 1; i < number; i++) {
        if (arr[i] < min_value) {
            min_value = arr[i];
        }
    }

    // Output the minimum value
    printf("Minimum value: %d\n", min_value);

    return 0;
}
