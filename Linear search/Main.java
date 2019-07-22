#include<stdio.h>
int main()
{
 int n,i,search_ele;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
   scanf("%d",&search_ele);
  for(i=0;i<n;i++)
  {
    if(a[i]==search_ele)
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",search_ele);
    return 0;
}