#include<stdio.h>
#include<conio.h>
void main()
{
char i,c;
clrscr();
for(i=97;i<=122;i++)
{
printf("\n %d is ASCII value of %c",i,i);
scanf("%c",&c);
}
getch();
}