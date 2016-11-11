package eu.senuna.oop2.encapsulation;

/**
 * Created by senuna on 11.11.16.
 */
public class Main {
    public static void main(String[] args) {

       //region nooope!
//        Player player = new Player();
//       //it's noooot goood approach.
//        player.health = 100;
//        player.weapon = "Axe";
//        player.name = "Elf";
//
//        int damage = 60;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healtRemaining());
//
//        //i can access directly fields of class Player
//        player.health = 123;
//        damage = 45;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healtRemaining());
        //endregion

        EnhancedPlayer player = new EnhancedPlayer("Ines", 200, "Bow");
        System.out.println("Starting with health " + player.getHealth());

    }
}
