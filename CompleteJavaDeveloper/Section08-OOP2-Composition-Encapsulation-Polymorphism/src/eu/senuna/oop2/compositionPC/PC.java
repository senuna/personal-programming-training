package eu.senuna.oop2.compositionPC;

/**
 * Created by senuna on 09.11.16.
 */

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
       // getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //some graphics, make it fancy
        monitor.drawPixelAt(1200,50,"green");
    }

    //senuna: actually I don't need it... i can access everything in them directly from Objects (if they are set properly)
//    //changing the access from outside
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
