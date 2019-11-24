import java.util.Scanner;

class employ{
		String e_name;
		int e_id;
		double b_salary,g_salary;
		
		void input(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name :");
			e_name=sc.nextLine();
			System.out.println("Enter the id :");
			e_id=sc.nextInt();
			System.out.println("Enter the Basic Salary  :");
			b_salary=sc.nextDouble();
			
		}
		double salary(){
			double da=(60.0/100.0)*b_salary;
			double hra=(15.0/100.0)*b_salary;
			return g_salary=b_salary+da+hra;
			
		}
		void display(){
			System.out.println("Employ name :"+e_name);
			System.out.println("Employ id :"+e_id);
			System.out.println("Basic Salary :"+b_salary);
			System.out.println("Gross Salary :"+salary());
			System.out.println("");
		}
		
}

class e_data{
	public static void main(String[] args){
	employ e1 = new employ();
	employ e2 = new employ();
	employ e3 = new employ();
	e1.input();
	e2.input();
	e3.input();
	e1.display();
	e2.display();
	e3.display();
	
	
	}
}