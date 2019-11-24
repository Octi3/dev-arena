# include<stdio.h>
# include<conio.h>

main()
{
    int a,b,c,i,z;
    printf("Enter which operation you want to perform of two numbers :\n");
    for(i=0;i<40;i++)
        printf("-");
    printf("1 for Add\n
            2 for multi\n
            3 for mod");
    for(i=0;i<40;i++)
        printf("-");
    for(i=0;i<40;i++)
        printf("-");
    getch()    
    printf("Enter two numbers :");
    scanf("%d",&b,&c);
    switch (a)
    {
        case 1:
            z=add(b,c)
            break;
        case 2:
            z=multi(b,c)
            break;
        case 3:
            z=mod(b,c)
            break;
                    
    
        default:
            break;
    }        
    printf("Ans=%d",z);
    getch()

}

int add(int x,int y)
{
    int c=x+y;
    return(c);
}

int multi(int x ,int y)
{
    int c=x*y;
    return(c);
}

int mod(int x,int y)
{
    int c=x%y;
    return(c);
}
