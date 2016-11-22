package eu.senuna.ArrayListChallenge;

/**
 * Created by senuna on 22.11.16.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //senuna: static here help creating record, without making new object
    // ? hm?
    public static Contact createRecord(String name, String phoneNumber){
        return new Contact(name, phoneNumber);

    }

}
