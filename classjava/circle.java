import java.util.Scanner;

class cir{
    double r;
    

    void cir(double x ){
        
        this.r=x;
        
        System.out.println("Area =  "+(Math.PI*r*r)) ;
    }
}

class circle{
    public static void main(String[] args) {
        cir ci = new cir();
        ci.cir(2);
    }
}