package eu.senuna.oop1.inheritance;

/**
 * Created by senuna on 08.11.16.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //each dog has brain and body... so we define it as 1, 1
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chews");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog walks");
        super.move(5); //animal move will be called
    }

    public void run(){
        System.out.println("Dog runs");
        move(10); //the method below - overrided class
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move method called");
        super.move(speed);
    }
}
