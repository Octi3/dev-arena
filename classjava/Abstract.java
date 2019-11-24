import java.util.*;

abstract class Person{
    String name , address;
    int age;
    abstract void inputPerson();
    void disPerson(){
        System.out.println("\tName :"+name+"\n\tAddress :"+address+"\n\tAge :"+age);
    }
}

class Teacher extends Person{
    int tid,n;
    String cources[] =new String[10];
    double hours;
    void inputPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Teacher :");
        name =sc.nextLine();
        System.out.println("Enter the Address :");
        address=sc.nextLine();
        System.out.println("Enter the age :");
        age=sc.nextInt();
        System.out.println("Enter the Teacher ID :");
        tid=sc.nextInt();
        System.out.println("Enter the No of cources :");
        n=sc.nextInt();
        
        System.out.println("Enter the Name of cources :");
        for(int i=0;i<n;i++)
            cources[i]=sc.nextLine();
    }        
    void showDetails(){
        super.disPerson();
        System.out.println("Teacher ID :"+tid);
        System.out.println("Cources :");
        for(int i=0;i<n;i++)
            System.out.print("\t"+cources[i]);
    
    }        

    
}
class Student extends Person{
    int roll,n;
    String branch;
    String cour_opt[]=new String[10];
    void inputPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Name of Student :");
        name =sc.nextLine();
        System.out.println("Enter the Address :");
        address=sc.nextLine();
        System.out.println("Enter the age :");
        age=sc.nextInt();
        System.out.println("Enter the Roll :");
        roll=sc.nextInt();
        System.out.println("Enter the Branch :");
        branch=sc.nextLine();
        System.out.println("Enter the No of cources opted :");
        n = sc.nextInt();
        
        System.out.println("Enter the Name of the cources :");
        for(int i=0;i<n;i++)
            cour_opt[i]=sc.nextLine();    
    }
    void showDetails(){
        super.disPerson();
        System.out.println("Age :"+age);
        System.out.println("Roll :"+roll);
        System.out.println("Branch :"+branch);
        System.out.println("Cources");
        for(int i=0;i<n;i++)
            System.out.print("\t"+cour_opt[i]);    
    
    }
}

class Abstract{
    public static void main(String[] args) {
        Teacher te  = new Teacher();
        Student st = new Student();
        te.inputPerson();
        te.showDetails();
        st.inputPerson();
        st.showDetails();  
    }
}