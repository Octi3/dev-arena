# include<stdio.h>
void main()
{
    int a[5],i,sum=0;
    printf("Enter the array elements to add : ");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<5;i++)
    {
        sum=sum+a[i];
    }
    printf("sum=%d",sum);
}