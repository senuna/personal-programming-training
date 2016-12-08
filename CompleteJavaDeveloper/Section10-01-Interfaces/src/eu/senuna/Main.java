package eu.senuna;

/**
 * Created by senuna on 07.12.16.
 */
public class Main {
    public static void main(String[] args) {
        ITelephone inezsPhone; //check this out!!
        inezsPhone = new DeskPhone(65989);
        inezsPhone.powerOn();
        inezsPhone.callPhone(123456);
        inezsPhone.answer();
    }

}
