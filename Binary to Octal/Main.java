#include<stdio.h>
int power_fn(int base,int exp)
{
  int i,sum=1;
  for(i=0;i<exp;i++)
  {
    sum=sum*base;
  }
  return sum;
}
int main()
{
  int bin,sum=0,rem,exp=0;
  scanf("%d",&bin);
  while(bin!=0)
  {
    rem=bin%10;
    sum=sum+rem*power_fn(2,exp);
    exp++;
    bin=bin/10;
  }
  int a[100],j,i=0;
  while(sum!=0)
  {
    a[i++]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",a[j]);
}