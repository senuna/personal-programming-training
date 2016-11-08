package eu.senuna.oop1.inheritancechallenge;

/**
 * Created by senuna on 08.11.16.
 */

public class CRV extends Car {
    private boolean differentialLock;
    private int hondaWarrantyMonths;

    public CRV(boolean differentialLock, int hondaWarrantyMonths) {
        super("Honda CRV", 2.2, 5, 5, 6, true);
        this.differentialLock = differentialLock;
        this.hondaWarrantyMonths = hondaWarrantyMonths;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
        } else if (newSpeed>0 && newSpeed <= 5){
            changeGear(1);
        } else if (newSpeed>5 && newSpeed <= 10){
            changeGear(2);
        } else if (newSpeed>10 && newSpeed <= 30){
            changeGear(3);
        } else if (newSpeed>30 && newSpeed <= 50) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        if (newSpeed >0){
            //senuna: look closer
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
