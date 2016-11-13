package eu.senuna;

/**
 * Created by senuna on 13.11.16.
 */
public class HealtyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealtyBurger(String meat, double price) {
        super("Helathy burger", meat, price, "brown");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }


    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrize = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrize += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrize += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrize;
    }
}
