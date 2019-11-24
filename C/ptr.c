# include<stdio.h>
void ln();
void ln(){
	printf("\n");
}





void main()
{
	int m=29;
	ln();
	printf("Address: %d",&m);
	ln();
	printf("Value: %d",m);
	ln();
	int *ab;
	ab=&m;
	printf("Address pointer ab : %d",&ab);
	ln();
	printf("Content of pointer ab : %d",*ab);
	ln();
	m=34;
	printf("Address pointer ab : %d",&ab);
	ln();
	printf("Content of pointer ab : %d",*ab);
	ln();
	m=7;
	printf("Address pointer ab : %d",&ab);
	ln();
	printf("Content of pointer ab : %d",*ab);
	

}