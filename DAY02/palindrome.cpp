#include <iostream>
using namespace std;
int main()
{
    int n,p,r,s=0;
    cout<<"enter a number";
    cin>>n;
    p=n;
    while(n>0)
    {
        r=n%10;
        s=s*10+r;
        n=n/10;
    }
    if(s==p)
    cout<<"Palindrome no";
    else
    cout<<"Not Palindrome no";
}