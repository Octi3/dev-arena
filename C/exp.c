# include<stdio.h>
# include<stdlib.h>
# define max 10
int stack[max];
int top = -1;
//------------------------------------declaration-------------------------
void push(int data);
int isfull();
int pop();
int isempty();
int peak();
void display();
//----------------------push-----------------------------------------------
void push(int data){
	if(isfull())
		printf("Stack is full");
	else{
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
int pop(){
	if(isempty())
		printf(" Stack is empty");
	else {
		int data;
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
		int n,x,p;
		char ch;
	while(1){
		printf("\nEnter the operation :\n 1-> push \n 2-> pop \n 3-> peak \n 4-> display 5-> exit \n");
		scanf("%d",&n);
		switch(n){
			case 1 : 
			printf("Enter the no. to push :");
			scanf("%d",&p);
			push(p); break;
			case 2 : x=pop(); display(); printf("\n"); break;
			case 3 : peak() ; break;
			case 4 : display(); break;
			case 5 : exit(1);
		}
		
	}
}