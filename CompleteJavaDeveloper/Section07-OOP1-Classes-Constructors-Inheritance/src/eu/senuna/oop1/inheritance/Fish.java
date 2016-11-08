package eu.senuna.oop1.inheritance;

/**
 * Created by senuna on 08.11.16.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fint;

    public Fish(String name, int size, int weight, int gills, int eyes, int fint) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fint = fint;
    }

    private void rest(){

    }

    private void moveMusceles(){
        System.out.println("Move muscels");
    }

    private void moveBackFin(){
        System.out.println("Move back fin");
    }

    private void swim(int speed){
        moveMusceles();
        moveBackFin();
        super.move(speed);
    }


}
