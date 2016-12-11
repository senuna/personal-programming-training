package eu.senuna.intro;

/**
 * Created by eu.senuna.intro.eu.senuna on 07.12.16.
 */
public class Main {
    public static void main(String[] args) {
        ITelephone inezsPhone; //check this out!!
        inezsPhone = new DeskPhone(65989);
        inezsPhone.powerOn();
        inezsPhone.callPhone(65989);
        inezsPhone.answer();

        inezsPhone = new MobilePhone(97654);
        inezsPhone.powerOn();
        inezsPhone.callPhone(97654);
        inezsPhone.answer();
    }

}
