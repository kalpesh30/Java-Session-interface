@FunctionalInterface
public interface waterinterface {
    void waterinterfaceMethod(int a,int b);
    
    default void sayOuch() {
        System.out.println("Ouch !!") ;
    }

}

// In Functional interfaces ther is only one abstract method