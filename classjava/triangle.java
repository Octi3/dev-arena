import java.util.Scanner;

class tri{
    int b,h;
    Scanner sc = new Scanner(System.in);

    void cal(){
        System.out.println("Enter height and base :");
        b = sc.nextInt();
        h = sc.nextInt();
        System.out.println("Area =  "+((b*h)/2)) ;
    }
}

class triangle{
    public static void main(String[] args) {
        tri tr = new tri();
        tr.cal();
    }
}