package eu.senuna.oop2.encapsulation;

/**
 * Created by senuna on 11.11.16.
 */
public class Player {

    public String name; //if I change a name for newName a need to change it everywhere - not only in this class
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Sorry - K.O.");
            //Reduce number of lives left
        }
    }

    public int healtRemaining() {
        return this.health;
    }
}
