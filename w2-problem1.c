#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int N,M,L,R,X,Q;
    scanf("%d",&N);
    int a[N];
    for(int i=0;i<N;i++)
    {
        a[i]=0;
    }
    scanf("%d",&M);
    for(int i=0;i<M;i++)
    {
        scanf("%d%d",&L,&R);
        for(int j=L;j<=R;j++)
        {
            a[j]++;
        }
    }
    scanf("%d",&Q);
    for(int i=0;i<Q;i++)
    {
        scanf("%d",&X);
        int count=0;
        for(int j=0;j<N;j++)
        {
            if(a[j]>=X)
                count++;
        }
        printf("%d",count);
        printf("\n");
    }
    return 0;
}
