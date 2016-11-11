package eu.senuna.oop2.encapsulationPrinter;

/**
 * Created by senuna on 12.11.16.
 */
public class Main {
    public static void main(String[] args) {
        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.


        Printer printer1 = new Printer(50, true);
        System.out.println("initial page count " + printer1.getPagesPrinted());

        int pagesPrinted = printer1.printPages(6);
        System.out.println("Printed pages of " + pagesPrinted +" now total is " + printer1.getPagesPrinted());

        Printer printer2 = new Printer(20, false);
        pagesPrinted = printer2.printPages(2);
        System.out.println("Printed pages of " + pagesPrinted +" now total is " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(6);
        System.out.println("Printed pages of " + pagesPrinted +" now total is " + printer2.getPagesPrinted());

    }
}
