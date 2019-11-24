public class trail{
    enum Country{India, Japan, US }

    public static void main(String[] args) {
        for(Country country : Country.values())
            System.out.println("country is "+country);
             
        }
}