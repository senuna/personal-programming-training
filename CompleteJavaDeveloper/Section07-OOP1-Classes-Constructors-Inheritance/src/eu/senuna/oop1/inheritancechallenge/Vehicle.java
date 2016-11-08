package eu.senuna.oop1.inheritancechallenge;

/**
 * Created by senuna on 08.11.16.
 */
public class Vehicle {
    private String brandName;

    private double engineSize;

    private int currentDirection;
    private int currentSpeed;

    public Vehicle(String brandName, double engineSize) {
        this.brandName = brandName;
        this.engineSize = engineSize;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move() - Actually moving with " + currentSpeed + " into " + currentDirection + " angle (or something");
    }

    public void steer(int direction){
        currentDirection = direction;
        System.out.println("Vehicle.steer() - actually steering at " + currentDirection + "degree/angle something");
    }

    public void stop(){
        this.currentSpeed = 0;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
