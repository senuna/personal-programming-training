package eu.senuna.oop1.inheritance;

/**
 * Created by senuna on 08.11.16.
 */
public class Main {

    public static void main(String[] args) {
        //region inheritance

        Animal cosiek = new Animal();
        System.out.println(cosiek.getName());

        Animal zwierz = new Animal("Zwierz", 1, 1, 5, 7);

        Dog as = new Dog("As", 5, 15, 2, 4, 1, 38, "long");
        as.eat();
        as.walk();
        as.run();
        //endregion
    }
}
