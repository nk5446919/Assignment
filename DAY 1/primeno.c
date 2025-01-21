#include<stdio.h>
#include<conio.h>
int main()
{
    int num,count=0,i;
    printf("\n enter a num for check:");
    scanf("%d",&num);
    for(i=1;i++;i<=num)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        printf("num is prime");
    }
    else
    {
        printf("num is not prime");
    }
    getch();

}