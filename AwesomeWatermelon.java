public class AwesomeWatermelon {
    public static void main(String[] argv) {
        //ananonymous class
        WaterisClass w = new WaterisClass() {
            public void waterinterfaceMethod() {
                System.out.println("Yay, second method") ;
            }
        };
        w.waterinterfaceMethod();
    }    
}