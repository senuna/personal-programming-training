package eu.senuna.ArrayListChallenge;

import java.util.ArrayList;

/**
 * Created by senuna on 22.11.16.
 */
public class mobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public mobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>(); //initializing just so clean
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition <0){
            System.out.println(oldContact.getName() + " wasn't found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition <0){
            System.out.println(contact.getName() + " wasn't found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was removed");
        return true;
    }

    //those classes I use in query contact, becouse not want to allow others to take ints
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
}
