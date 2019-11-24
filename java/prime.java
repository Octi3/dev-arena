import java.util.Scanner;

class prime{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number to find prime or not");
	
	int n1 = input.nextInt();
	int i,count=0;
	for(i=1;i<=n1;i++){
		if(n1%i==0)
			count++;
	}
	if(count==2)
		System.out.println("Prime Number");
	else
		System.out.println("Not-Prime Number");
	
	
	
	
	}
}