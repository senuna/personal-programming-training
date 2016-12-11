package eu.senuna.intro;

/**
 * Created by eu.senuna.intro.eu.senuna on 08.12.16.
 */
public class MobilePhone implements ITelephone {
    private  int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobilephone");
        } else {
            System.out.println("Phone is swithced off");
        }
        }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody playing");
        } else{
            isRinging = false;
            System.out.println("Mobile phone not on or another number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}