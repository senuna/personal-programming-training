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

        }

    }

    private static void startPhone(){

    }

    private static void printActions(){

    }

}
