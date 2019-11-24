import java.util.Scanner;

class Rectangle{
	int x,y;
	
	int area(){
		return x*y;
	}
	int peri(){
		return 2*(x+y);
	}
	
	void setsize(int a, int b){
		this.x = a;
		this.y = b;
	}
}



class rect{
	public static void main(String args[]){
		
	System.out.println("This is to find the area and perimeter of rectangle");
	
			Rectangle r1 = new Rectangle();
			Rectangle r2 = new Rectangle();
			
			
			r1.setsize(4,3);
			r2.setsize(5,2);
			
		System.out.printf("The area of 1st rectangle is %d and the perimeter is %d \n", r1.area(), r1.peri());
		System.out.printf("The area of 2nd rectangle is %d and the perimeter is %d \n", r2.area(), r2.peri());
		
	}
}
		