import java.util.Scanner;
class test3{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the no to check Perfect or not :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i == 0)
                sum =sum+i;
        }
        if(sum==n)
            System.out.println("It is a perfect number ");
        else 
            System.out.println("It's not a Perfect number");   
    }
}