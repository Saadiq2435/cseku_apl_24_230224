#include <stdio.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d", &t);
    
    while (t--) {
        int x1, x2, x3;
        scanf("%d %d %d", &x1, &x2, &x3);
        int b = 10000;
        for (int a = 1; a <= 10; a++) {
            int d = abs(a - x1) + abs(a - x2) + abs(a - x3);
            if (d < b) {
                b = d;
            }
        }
        
        printf("%d\n", b);
    }
    
    return 0;
}
