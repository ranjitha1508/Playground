#include<stdio.h>
int main()
{
  int dia;
  float r,area;
  scanf("%d",&dia);
  r=dia/2.0;
  area=3.14*r*r;
  printf("%.2f",area);
  return 0;
}