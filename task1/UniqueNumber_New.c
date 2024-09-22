#include <stdio.h>

int main() {
    int test_cases;

    // Input number of test cases
    scanf("%d", &test_cases);

    // Loop through each test case
    while (test_cases--) {
        int target_sum, found = 0;

        // Input the target sum
        scanf("%d", &target_sum);

        // If the target sum is greater than or equal to 45, output -1
        if (target_sum >= 45) {
            printf("-1\n");
        }
        // If the target sum is less than or equal to 9, output the number itself
        else if (target_sum <= 9) {
            printf("%d\n", target_sum);
        }
        // Otherwise, search for two numbers between 1 and 9 that sum to the target
        else {
            for (int i = 1; i <= 9 && !found; i++) {
                for (int j = 1; j <= 9; j++) {
                    // If the sum of i and j equals the target sum
                    if (i + j == target_sum) {
                        printf("%d%d\n", i, j);
                        found = 1; // Stop after the first valid pair is found
                        break;
                    }
                }
            }
        }
    }

    return 0;
}
