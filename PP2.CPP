#include <iostream.h >
#include < conio.h >
#define max 100
#include<stdlib.h>
#include<ctype.h>
int top=-1;
char stk[max];

push(char elem)
{                       /* Function for PUSH operation */
    stk[++top]=elem;
}

char pop()
{                      /* Function for POP operation */
    return(stk[top--]);
}

int pr(char elem)
{                 /* Function for precedence */
    switch(elem)
    {
    case '#': return 0;
    case '(':
    case '{':
    case '[': return 1;
    case '+':
    case '-': return 2;
    case '*':
    case '/':
    case '%': return 3;
    case '$': return 4;
    }
}

void main()
{
	char exp[100],pofx[100],ch,elem;
	int choice=1;
	clrscr();
       while(choice==1)
       {
	int i,k,flag=0,l=0,m=0;
	top=-1;
	cout<<"\nEnter an infix expression ";
	cin>>exp;
	for(i=0; exp[i] != '\0'; i++)
	{
			if(isalnum(exp[i]))

			  l=l+1;

		if(exp[i]=='+'||exp[i]=='-'||exp[i]=='*'||exp[i]=='/'||exp[i]=='%'||exp[i]=='$')
		m=m+1;
		if( exp[i]=='(' || exp[i] =='[' || exp[i] == '{' )
		{
			top++;
			stk[top]= exp[i];
		}
		else
		if ( exp[i] == ')' )
		{
			if( stk[top] == '(' )
			top--;

		else
		{
			cout<<"\nUnbalanced exp";
			exit(0);
		}

	       }
	       else

		if ( exp[i] == ']' )
		{
			if( stk[top] == '[' )
			top--;

		else
		{
			cout<<"\nUnbalanced exp";
			exit(0);
		}
	   }

    else

		if ( exp[i] == '}' )
		{
			if( stk[top] == '{' )
			top--;

		else
		{
			cout<<"\nUnbalanced exp";
			exit(0);
		}
		}

      }
	    if(l<=m)
		{ // cout<<l<<"\t"<<m;
	       //	 cout<<"\nunbalanced expression";
		// getch();
	   //	 exit(0);
		 top=top+1;
		// getch();
		}
		if(l-m!=1)
		{
		 top=top+1;
		}
if( top == -1 )
     {
		cout<<"\nExp is balanced";
		 flag=1;
      }
	else
		cout<<"\nExp is not balanced";

   if (flag==1)
   {
    i=0,k=0;
    push('#');
     while( (ch=exp[i++]) != '\0')
    {
	if( ch == '('||ch=='['||ch=='{')
	 push(ch);
	else
	    if(isalnum(ch)) pofx[k++]=ch;
	    else
		if( ch == ')'||ch==']'||ch=='}')
		{
		   if(ch==')')
		   {
		    while( stk[top] != '(')
			pofx[k++]=pop();
		    elem=pop(); /* Remove ( */
		    }
		    if(ch==']')
		    {
		     while(stk[top]!='[')
		      pofx[k++]=pop();
		      elem=pop();
		     }
		     if(ch=='}')
		     {
		      while(stk[top]!='{')
		      pofx[k++]=pop();
		      elem=pop();
		     }
		}
		else
		{       /* Operator */
		    while( pr(stk[top]) >= pr(ch) )
			pofx[k++]=pop();
		    push(ch);
		}
    }
    while( stk[top] != '#')
	pofx[k++]=pop();
    pofx[k]='\0';
    cout<<"\nGiven infix expression  "<<exp<<"\n"<<"postfix exp  "<<pofx;
}
 cout<<"\n\nwant to check for another expression if yes press 1 else press 0";
 cin>>choice;
 getch();
  }
}