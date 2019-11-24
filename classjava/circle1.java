import java.util.Scanner;

class cir{
    double r , h;
    

    void cir(double x ){
        
        this.r=x;
        
        System.out.println("Area of circle =  "+(Math.PI*r*r)) ;
    }
    void cir(double x,double y ){
        
        this.r=x;
        this.h=y;
        
        System.out.println("Area of triangle =  "+(r*h)/2) ;
    }
    void cir(int x,int y ){
        
        
        
        
        System.out.println("Area of rect =  "+(x*y) ;
    }
}

class circle1{
    public static void main(String[] args) {
        cir ci = new cir();
        ci.cir(2);
        ci.cir(2,3);
        c1.cir(2.0,3.0);

    }
}