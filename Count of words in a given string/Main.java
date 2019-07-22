#include<stdio.h>

int main()
{
 char str[100],word;
  int i;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
  return 0;
}
  
