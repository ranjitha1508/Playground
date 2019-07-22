#include<stdio.h>
int main()
{
  	int arr[100],n,i,a,b,fnl=0,fnl1=0,emm=0,emm1=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    scanf("%d%d",&a,&b);
  for(i=0;i<n;i++)
  {
    if(arr[i]==a)
    {
      fnl=1;
      emm= i;
    }
    else if(arr[i]==b)
    {
      fnl1=1;
      emm1= i;
    }
  }
  if(fnl==1)
  printf("Element 1 index = %d\n",emm);
  else
    printf("Element 1 index = -1\n");
  if(fnl1==1)
  printf("Element 2 index = %d",emm1);
  else
    printf("Element 2 index = -1");
}
