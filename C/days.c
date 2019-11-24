# include<stdio.h>

void main()
{
    int days,month,a,weeks;
    printf("Enter Days:");
    scanf("%d",&days);
    month = days/30;
    a = days%30;
    weeks = days/4;
    printf("%d Months and %d Days\nWeek=%d\n",month,a,weeks);
 }