#include <stdio.h>

int main()
{
    int a,b,c,d;
    scanf("%d %d %d %d",&a,&b,&c,&d);

    if((a+b>c && b+c>a && c+a>b) || (b+c>d && c+d>b && b+d>c) ||(a+c>d && a+d>c && c+d>a) || (a+b>d && a+d>b && b+d>a) )
    {
        printf("TRIANGLE\n");
    }
    else if(a+b==c || b+c==a || c+a==b || b+c==d || c+d==b || b+d==c || a+c==d || a+d==c || c+d==a || a+b==d || a+d==b || b+d==a)
    {
        printf("SEGMENT\n");
    }
    else 
    {
        printf("IMPOSSIBLE\n");
    }

    return 0;
}
