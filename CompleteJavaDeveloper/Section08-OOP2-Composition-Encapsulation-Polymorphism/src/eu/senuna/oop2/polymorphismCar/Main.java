package eu.senuna.oop2.polymorphismCar;

/**
 * Created by senuna on 12.11.16.
 */

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car - start engine";
    }

    public String accelerate(){
        return "Car - accelerate";
    }

    public String brake(){
        return "Car - brake";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi - start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi - accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi - brake";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden - start engine";
    }

    @Override
    public String accelerate() {
        return "Holden  - accelerate";
    }

    @Override
    public String brake() {
        return "Holden - brake";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - getted class name - start engine";
    }

    @Override
    public String accelerate() {
        return "Ford - accelerate";
    }

    @Override
    public String brake() {
        return "Ford - brake";
    }
}

public class Main {

    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generice car calss.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {

        Car car = new Car(4, "standard");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "wooow");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "fiesta");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

//        Car ford = new Car(6, "fiesta") {
//            //inline created class
//            //often in android click listener
//            @Override
//            public String startEngine() {
//                return "Ford - start engine";
//            }
//
//            @Override
//            public String accelerate() {
//                return "Ford - accelerate";
//            }
//
//            @Override
//            public String brake() {
//                return "Ford - brake";
//            }
//        };


    }

}
