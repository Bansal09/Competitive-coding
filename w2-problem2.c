#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    char s[100];
    scanf("%d",&t);
    for(int i=1;i<=t;i++)
    {
        int a=0,b=0; 
        scanf("%s",s);
        for(int j=0;j<strlen(s);j++)
        {
            if(s[j]=='1')
                b++;
            else if(s[j]=='0')
                a++;
            
        }
        if(a<b)
            printf("%d",a);
        else
            printf("%d",b);
        
    printf("\n");
            
    }
    return 0;
}
