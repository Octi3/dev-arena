# include<stdio.h>
# include<stdlib.h>
# define max 10
char stack[max];
int top = -1;
//------------------------------------declaration-------------------------
void push();
int isfull();
char pop();
int isempty();
int peak();
void display();
//----------------------push-----------------------------------------------
void push(){
	if(isfull())
		printf("Stack is full");
	else{
		char data;
		printf("Enter the character:");
		scanf("%c",&data);
		top = top+1;
		stack[top]=data;
		printf("\nData Entered %d \n",data);
		
	}
}
int isfull(){
	if(top == max-1)
		return 1;
	else
		return 0;
	
}
//---------------------pop---------------------------------------------------
char pop(){
	if(isempty())
		printf(" Stack is empty");
	else {
		char data;
		data = stack[top];
		top=top-1;
		return data;
		
	}
}
int isempty(){
	if(top==-1)
		return 1;
	else
		return 0;
		
}
int peak(){
	return stack[top];
}

void display(){
	int i ;
	for(i=top;i>=0;i--)
		printf("%d\t",stack[i]);
}


void main (){
		int n;
		char p,x;
	while(1){
		printf("\nEnter the operation :\n 1-> push \n 2-> pop \n 3-> peak \n 4-> display 5-> exit \n");
		scanf("%d",&n);
		switch(n){
			case 1 : 
			push(); break;
			case 2 : x=pop(); display(); printf("\n"); break;
			case 3 : peak() ; break;
			case 4 : display(); break;
			case 5 : exit(1);
		}
		
	}
}