#include <stdio.h>
#include<math.h>

int main()
{
    
    int i, t;
    scanf("%d", &t);

   
    for (i = 0; i < t; i++) {
        int n;
        scanf("%d",&n);
        int s=pow(2,n);
        printf("%d\n",s-1);
        
    }

    return 0;
}
