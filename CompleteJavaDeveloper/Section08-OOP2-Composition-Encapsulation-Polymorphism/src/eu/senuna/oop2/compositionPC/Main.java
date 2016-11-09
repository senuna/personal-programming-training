package eu.senuna.oop2.compositionPC;

/**
 * Created by senuna on 08.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2205", "Samsung", "220", dimensions);

        Monitor theMonitor = new Monitor("2515H", "Dell", 25, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Ausus", 4,5,"v2.01");

        //senuna: let the show begin!
        PC thePC = new PC(theCase, theMonitor, motherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Windows sucks!");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();


    }
}
