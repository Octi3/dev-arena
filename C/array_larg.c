# include<stdio.h>
void main()
{
    int a[5],i,sum=0,large;
    printf("Enter the array elements to add : ");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    large=a[0];
    for(i=1;i<6;i++)
    {
        if(large<a[i])
        {
            large=a[i];
        }
    }
    printf("Largest=%d",large);
}