import javax.lang.model.util.ElementScanner6;

class excep_1 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        try{
        arr[0]=50;
        arr[1]=60;
        arr[2]=70;
        arr[3]=10;
        
            
            System.out.println(arr[3]);
    
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of range " + e);


        }
        try{
            String p="Pankaj";
            int x=Integer.parseInt(p);
            System.out.println(x);
        }
        catch(NumberFormatException e){
            System.out.println("String in int type " +e); 


        }
        try{
            String pan="pankaj";
            String st=null;
            if(st.equals(pan))
                System.out.println("True ");
            else
                System.out.println("False");

        }
        catch(NullPointerException e){
            System.out.println("NULL exception " +e);
        }
    }
}