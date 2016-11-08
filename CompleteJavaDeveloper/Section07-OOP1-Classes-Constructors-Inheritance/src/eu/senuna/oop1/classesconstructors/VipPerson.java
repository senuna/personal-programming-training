package eu.senuna.oop1.classesconstructors;

/**
 * Created by senuna on 08.11.16.
 */
public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipPerson(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email");
    }

    public VipPerson() {
        this("noname", 0, "unknown@email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
