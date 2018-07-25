public class Lamda {
    public static void main(String args[])
    {
        // LAmda expressions can only be used with functional interfaces  
        
        waterinterface Wat = (a,b) -> {
            System.out.println(a + " " + b) ;
        } ;
        
        Wat.waterinterfaceMethod(2,3);

        System.out.println("See the Lamda Expression ") ;
    }
}