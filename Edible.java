public interface Edible {
    void taste();

    void isSweet() ;

    void  isSour() ;

    void isSpicy() ;

    default void isTasty() {
        System.out.print("is tasty very tasty");
    }

    default void isHorrible() {
        System.out.println("hello the first") ;
    }


}