#include<stdio.h>
#include<conio.h>
int main()
{
    int a=0,b=1,c,i;
    printf("\n%d",a);
    printf("\n%d",b);
    for(i=1;i<=5;i++)
    {
        c=a+b;
        printf("\n%d",c);
        a=b;
        b=c;
    }
    getch();
}