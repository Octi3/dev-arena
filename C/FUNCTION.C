# include<stdio.h>
# include<conio.h>


void line(void);
void delay(void);
 void main()
{
   
    line();
    printf("\nhello\n");
    delay();
    line();
    delay();
    getch();
}
void line()
{
    int i;
    for(i=0;i<41;i++)
       printf("-");
       
    
}
void delay()
{   int i,j;
    for(i=0;i<100000;i++)
        for(j=0;j<100000;j++)
        {}

}