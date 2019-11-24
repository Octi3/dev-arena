# include<stdio.h>
void main(){
	int arr[10],i,n,pos,key;
	printf("Enter the no of elemets : ");
	scanf("%d",&n);
	printf("Enter the elements :");
	for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	printf("Enter the position to push the element :");
	scanf("%d",&pos);
	for(i=n-1;i>=pos-1;i--)
		arr[i+1]=arr[i];
	printf("Enter the element to push :");
	scanf("%d",&key);
	arr[pos-1]=key;
	for(i=0;i<n+1;i++)
		printf("%d",arr[i]);
	
	
}
