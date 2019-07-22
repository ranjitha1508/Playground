#include<stdio.h>
int main()
{
	long int n,i,fact=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
}