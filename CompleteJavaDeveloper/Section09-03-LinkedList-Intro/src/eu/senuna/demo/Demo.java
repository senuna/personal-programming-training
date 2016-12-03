package eu.senuna.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by senuna on 03.12.16.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Jamaika");
        addInOrder(placesToVisit, "Katowice");
        addInOrder(placesToVisit, "Kraków");
        addInOrder(placesToVisit, "Opole");
        addInOrder(placesToVisit, "Wrocław");
        addInOrder(placesToVisit, "Poznań");
        addInOrder(placesToVisit, "Szczecin");
        addInOrder(placesToVisit, "Gliwice");
        addInOrder(placesToVisit, "Zabrze");
        printList(placesToVisit);

        addInOrder(placesToVisit, "kolejny");
        addInOrder(placesToVisit, "Poznań");
        printList(placesToVisit);

        visit(placesToVisit);
        //Iterator stays between positions in list - check it out


        //region Linked List intro
//        placesToVisit.add("Krakow");
//        placesToVisit.add("Katowice");
//        placesToVisit.add("Opole");
//        placesToVisit.add("Wrocław");
//        placesToVisit.add("Poznań");
//        placesToVisit.add("Szczecin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(2, "Gliwice");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
        //endregion
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0 ){
                //equal, not adding
                System.out.println(newCity + " is already included as a destination ");
                return false;
            } else if (comparison > 0){
                //new City should appear before this one
                //we already moved to next entry - .next() so to do that we need to go back to the previous record to change the pointer
                //so: linked lists in java are doubled linked lists
                stringListIterator.previous(); //list iterator allowed us to do so
                stringListIterator.add(newCity);
                return true;
            } else if(comparison <0){
                //move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
        //it's not a good practice to return the value and changing the obcject in the same method
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; //checking direction
        ListIterator<String> listIterator = cities.listIterator();

    //    if(cities.getFirst() == ""){ really bad version!
        if(cities.isEmpty()){
            System.out.println("Nothing to show ");
            return;
        } else {
            System.out.println("Now visiting "+ listIterator.next() );
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation over :( ");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of list ");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println(
                "0 - to quit\n"+
                "1 - go to next city\n" +
                "2 - go to previous\n" +
                "3 - print menu options\n");
    }
}
