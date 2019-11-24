import java.util.Scanner;

class tri{
    int b,h;
    

    void cal(int x , int y){
        
        this.b=x;
        this.h=y;
        System.out.println("Area =  "+((b*h)/2)) ;
    }
}

class triangle1{
    public static void main(String[] args) {
        tri tr = new tri();
        tr.cal(2,3);
    }
}