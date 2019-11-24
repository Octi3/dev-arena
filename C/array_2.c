#include <stdio.h>

int main()
{
    int i, j, N;

    /* Input number of rows from user */
    //printf("Enter number of rows: ");
    //scanf("%d", &N);

    /* Iterate through N rows */
    for(i=1; i<=5; i++)
    {
        /* Iterate over columns */
        for(j=1; j<=5; j++)
        {
            /* Print star for each column */
            printf("*\t");
        }
        
        /* Move to the next line/row */
        printf("\n");
    }

    return 0;
}