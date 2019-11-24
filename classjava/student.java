import java.util.Scanner;
class detail{
	String name , branch;
	int roll;
	
	
} 
class marks{
	double m1,m2,m3,m4,m5,m6;
	double avg(double m1, double m2, double m3, double m4 , double m5 ,double m6){
		return (m1+m2+m3+m4+m5+m6)/6.0;
	}
	
}


class student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		detail det =new detail();
		System.out.println("Enter the name of the Student :");
		det.name=sc.nextLine();
		System.out.println("Enter the Branch of the Student :");
		det.branch=sc.nextLine();
		System.out.println("Enter the Roll no :");
		det.roll=nextInt();
		
		
		//--------------------------------marks implimentation----------------------------------------
		
		
		
		marks mks = new marks();
		System.out.println("Enter the marks of 6 different subjects :");
		mks.m1=sc.nextDouble();
		mks.m2=sc.nextDouble();
		mks.m3=sc.nextDouble();
		mks.m4=sc.nextDouble();
		mks.m5=sc.nextDouble();
		mks.m6=sc.nextDouble();
		double av=mks.avg(mks.m1,mks.m2,mks.m3,mks.m4,mks.m5,mks.m6);
		System.out.printf("Avg = "+av);
		
		
		//-----------------------------fail or pass------------------------------------------------------
		if(av>=60)
			System.out.println("First Division");
		else if(45<=av<60)
			System.out.println("Second division");
		else if(30<=av<45)
			System.out.println("Third division");
		else
			System.out.println("Fail");
		
		
		
		
		
		
		
		
	
		
	}
}