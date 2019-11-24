# include<stdio.h>
void main()
{
    int a[10][10] ,i,j,r,c;
    printf("Enter the rows and columns you want:");
    scanf("%d%d",&r,&c);
    printf("Enter the elements :");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("The matrix is :");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
    

}