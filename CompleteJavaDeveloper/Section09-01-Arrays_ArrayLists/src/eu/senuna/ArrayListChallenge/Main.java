package eu.senuna.ArrayListChallenge;

import java.util.Scanner;

/**
 * Created by senuna on 22.11.16.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("999 212 3654");
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    public static void main(String[] args) {

        //implementing menu

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 for print available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\n Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }

    }

    public static void addNewContact(){
        System.out.println("Enter new name for your contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createRecord(name, phoneNumber); //easier way... becouse of static
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + " , phone = " + phoneNumber);
        } else {
            System.out.println("Contact "+ name + " already on list. Has to be uniuqe.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact name existing in list: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return null;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createRecord(newName, newPhoneNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Udadated status: ok");
        } else {
            System.out.println("Updating status: error by ");
        }
    }

    private static void startPhone(){
        System.out.println("Starting the mobile ");

    }

    private static void printActions(){
        System.out.println("\n available actions: \n press");
        System.out.println("0 - shutdown \n" +
                        "1 - print contacts \n" +
        "2 - add new contact \n"+
        "3 - update \n"+
        "4 - remove contact\n"+
        "5 - query if an contact exist\n"+
        "6 - print available actions");
        System.out.println("chooce your action: ");
    }

}
