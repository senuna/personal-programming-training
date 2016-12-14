package eu.senuna.challenge;

/**
 * Created by senuna on 14.12.16.
 */
public class Player implements ISavable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }
}
