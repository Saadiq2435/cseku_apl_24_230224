#include<stdio.h>

int main(){
    int i,a[5],n;
    scanf("%d",&n);


   for(i=0;i<n;i++){
    scanf("%d",&a[i]);
   }
        int m = a[0] ;

   for(i=1;i<n;i++){
        if(m > a[i]){
            m=a[i];
        }
   }
   printf("%d\n",m);

   return 0;     

}
