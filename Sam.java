public class Sam implements Edible, Edible2 {
    public void taste() {
        System.out.println("Meao") ;
    }

    public void isSweet() {
        System.out.println("Haha") ;
    }

    public void isSour() {

    }

    public void isSpicy() {
        
    }

    public void isHorrible() {
        Edible.super.isHorrible() ;
    }

}