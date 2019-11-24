import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("Enter the operation you want 'ADD''SUB''MULT''DIV':");
        String  ch=sc.nextLine();
        float result=0;
        
        
        
       switch(ch){
            case "ADD" :
            case "add" :
                result= n1+n2; 
            break;
            case "SUB" :
            case "sub":
                result= n1-n2;
            break;
            case "MULT" :
            case "mult":
                result=n1*n2;
            break;
            case "DIV" :
            case "div" :
                result=n1/n2;
            break;
            default:
                System.out.println("Invalid Operation");
              
        }
        System.out.println("Result for your Opration " +ch +"   =    " + result);
    }
} 