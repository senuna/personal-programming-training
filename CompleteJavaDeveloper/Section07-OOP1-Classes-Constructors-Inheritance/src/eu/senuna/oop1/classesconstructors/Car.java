package eu.senuna.oop1.classesconstructors;

/**
 * Created by senuna on 07.11.16.
 */
public class Car {

    //state, fields
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setEngine(String engine){
        String validEngine = engine.toLowerCase();
        if(validEngine.equals("diesel") || validEngine.equals("bensin")) {
            this.engine = engine;
        } else {
            this.engine = "noname";
        }
    }

    public String getEngine(){
        return this.engine;
    }

}
