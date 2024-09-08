#include <stdio.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--){
        int a,c=0;
        scanf("%d",&a);
        if(a>=45)printf("-1\n");
        if(a<=9)printf("%d\n",a);
        else{
            for(int i=1;i<=9;i++){
                for(int j=1;j<=9;j++){
                    if(i+j==a){
                        c++;
                        if(c==1){printf("%d%d\n",i,j);break;}
                        
                    }
                   
                }
            }
        }
    }

    return 0;
}