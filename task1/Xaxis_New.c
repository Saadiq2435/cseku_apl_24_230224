#include <stdio.h>
#include <stdlib.h>

int main() {
    int test_cases;

    // Input number of test cases
    scanf("%d", &test_cases);
    
    // Loop through each test case
    while (test_cases--) {
        int x1, x2, x3;
        
        // Input three integer values
        scanf("%d %d %d", &x1, &x2, &x3);

        int min_distance = 10000;

        // Iterate through values of 'a' from 1 to 10
        for (int a = 1; a <= 10; a++) {
            // Calculate the total distance for the current value of 'a'
            int distance = abs(a - x1) + abs(a - x2) + abs(a - x3);
            
            // Update minimum distance if the current distance is smaller
            if (distance < min_distance) {
                min_distance = distance;
            }
        }
        
        // Output the minimum distance
        printf("%d\n", min_distance);
    }
    
    return 0;
}
