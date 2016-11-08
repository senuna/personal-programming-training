package eu.senuna.oop1.inheritancechallenge;

/**
 * Created by senuna on 08.11.16.
 */
public class Car extends Vehicle {
    private int numberOfWheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String brandName, double engineSize, int numberOfWheels, int doors, int gears, boolean isManual) {
        super(brandName, engineSize);
        this.numberOfWheels = numberOfWheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() - actuall gear set to " + currentGear);
    }

    public void changeSpeed(int speed, int direction ){
        System.out.println("Car.changeSpeed - speed " + speed + " into direction of " + direction + " degree/angle or something");
        move(speed, direction);
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }

}
