#include<iostream>
using namespace std;
int main()
{
    int fact=1,i=1,num;
    cout<<"enter any number";
    cin>>num;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
        i++;
    }
    cout<<"factorial of a num is"<<fact;
    
}