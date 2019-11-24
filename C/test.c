# include<stdio.h>
# include<stdlib.h>



void main(){
    int n ,i, a[100],j,k,ITEM;
    printf("Enter the no of elements you want in an array :");
    scanf("%d",&n);
    printf("Enter The Elements :");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(i=0;i<n;i++)
        printf("%d \t",a[i]);
    printf("\n");        
    //---------------inseting an Element-----------------------
    
    printf("Enter the position where to insert the Element :");
    scanf("%d",&k);
    printf("Enter the Element :");
    scanf("%d",&ITEM);
    while (j>=k)
    {
         a[j+1]=a[j];
        j--;
    }
    a[k]=ITEM;
    for(i=0;i<n;i++)
        printf("%d",a[i]);
    int f;    
    printf("Enter Exit or run again 1/0");
    scanf("%d",&f);
    if(f==1)
         exit(0);
    else if(f==0)
        main();
            

}
