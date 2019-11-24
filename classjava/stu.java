import java.util.*;

class student{
    String name , branch;
    int roll;
    student(){
        this.name=name;
        this.roll=roll;
        this.branch=branch;
        name = "default_name";
        roll = 1111;
        branch = "cse" ;
        System.out.println("Name= "+name+" Roll= "+roll+" Branch "+branch);
         
    }
    student(String name){
        this.name = name ;
        System.out.println("Name= "+name+" Roll= "+roll+" Branch= "+branch);

    }
    student(String name , int roll){
        this.name = name ;
        this.roll = roll ;
        System.out.println("Name= "+name+" Roll= "+roll+" Branch= "+branch);    
    }
    student(String name , int roll , String branch){
        this.name = name;
        this.roll = roll;
        this.branch = branch;
        System.out.println("Name= "+name+" Roll= "+roll+" Branch= "+branch);
    }
}

class stu{
    public static void main(String[] args) {
        student s = new student();
        student s1 = new student("japun");
        student s2 = new student("devraj",1234);
        student s3 = new student("pankaj",1236,"mech");

    }
}