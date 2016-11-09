package eu.senuna.oop2.compositionPC;

/**
 * Created by senuna on 08.11.16.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSloits;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSloits, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSloits = cardSloits;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSloits() {
        return cardSloits;
    }

    public String getBios() {
        return bios;
    }
}
