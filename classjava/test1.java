import java.util.Scanner;


public class test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("Enter the operation you want to do:");
        char ch=sc.next().charAt(0);
        float result=0;
        
        
        
       switch(ch){
            case '+' :result= n1+n2;
            break;
            case '/' :result= n1/n2;
            break;
            case '*' :result=n1*n2;
            break;
            case '-' :result=n1-n2;
            break;
            case '%' :result=n1%n2;
            break;
            default:
                System.out.println("Invalid Operation");
              
        }
        System.out.println("Result for your Opration " +ch +"   =    " + result);
    }
} 