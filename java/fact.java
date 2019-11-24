import java.util.Scanner;


class fact{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a number to find its factorial");
		
		int n1 = input.nextInt();
			
	
		int i;
		int fac = 1;
		for(i=1;i<=n1;i++)
			fac *= i;
		
	
	
	System.out.printf("The factorial of the number %d is %d \n", n1, fac ); 

	
	}
}



