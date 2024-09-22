#include <stdio.h>
#include <math.h>

int main() {
    int test_cases;

    // Input number of test cases
    scanf("%d", &test_cases);

    // Loop through each test case
    for (int i = 0; i < test_cases; i++) {
        int n;
        
        // Input the value of n
        scanf("%d", &n);

        // Calculate 2^n - 1
        int result = pow(2, n) - 1;

        // Output the result
        printf("%d\n", result);
    }

    return 0;
}
