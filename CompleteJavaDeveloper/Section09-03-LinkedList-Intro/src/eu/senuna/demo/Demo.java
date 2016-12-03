package eu.senuna.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by senuna on 03.12.16.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Krakow");
        placesToVisit.add("Katowice");
        placesToVisit.add("Opole");
        placesToVisit.add("Wrocław");
        placesToVisit.add("Poznań");
        placesToVisit.add("Szczecin");

        printList(placesToVisit);

        placesToVisit.add(2, "Gliwice");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);


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
                stringListIterator.previous(); //list iterator allowed us to do so
                stringListIterator.add(newCity);
                return true;
            } else if(comparison <0){
                //move on next city
            }
        }

        stringListIterator.add(newCity);
    }
}
