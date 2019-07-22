#include <stdio.h>
int main()
{
       
  int base,exp,result=1,i;
  scanf("%d%d",&base,&exp);
  if(exp>=0)
  {
    for(i=1;i<=exp;i++)
    {
      result=result*base;
    }
  printf("%d",result);
  }
  else
  {
    printf("Wrong input");
  }        
    return 0;
}