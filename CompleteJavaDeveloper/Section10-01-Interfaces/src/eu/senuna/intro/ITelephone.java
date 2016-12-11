package eu.senuna.intro;

/**
 * Created by eu.senuna.intro.eu.senuna on 07.12.16.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
