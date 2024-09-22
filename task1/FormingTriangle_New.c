#include <stdio.h>

int main() {
    // Variables representing the sides of a quadrilateral
    int side1, side2, side3, side4;

    // Input 4 sides of a potential quadrilateral
    scanf("%d %d %d %d", &side1, &side2, &side3, &side4);

    // Check if any three sides can form a triangle
    if ((side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) || 
        (side2 + side3 > side4 && side3 + side4 > side2 && side2 + side4 > side3) || 
        (side1 + side3 > side4 && side1 + side4 > side3 && side3 + side4 > side1) || 
        (side1 + side2 > side4 && side1 + side4 > side2 && side2 + side4 > side1)) 
    {
        printf("TRIANGLE\n");
    }
    // Check if any three sides form a segment (i.e., form a straight line)
    else if (side1 + side2 == side3 || side2 + side3 == side1 || side3 + side1 == side2 || 
             side2 + side3 == side4 || side3 + side4 == side2 || side2 + side4 == side3 || 
             side1 + side3 == side4 || side1 + side4 == side3 || side3 + side4 == side1 || 
             side1 + side2 == side4 || side1 + side4 == side2 || side2 + side4 == side1) 
    {
        printf("SEGMENT\n");
    } 
    // If neither a triangle nor a segment can be formed
    else {
        printf("IMPOSSIBLE\n");
    }

    return 0;
}
