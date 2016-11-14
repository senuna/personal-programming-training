package eu.senuna;

/**
 * Created by senuna on 13.11.16.
 */
public class DeluxeBurger extends Hamburger{

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.


    public DeluxeBurger() {
        super("Deluxe", "Bacon",10.12,"Wheat");
        super.addHamburgerAddition1("Chips", 1.99);
        super.addHamburgerAddition2("Drinks", 3.5);
    }
    //preventing adding rest of additions


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("It's already Deluxe! Give a break! ;-) - nothing more added");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("It's already Deluxe! Give a break! ;-)  - nothing more added");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("It's already Deluxe! Give a break! ;-)  - nothing more added");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("It's already Deluxe! Give a break! ;-)  - nothing more added");
    }
}
