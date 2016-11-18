package eu.senuna.ListsAndArrayLists;

import java.util.Scanner;

/**
 * Created by senuna on 16.11.16.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choicedItem = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choicedItem = scanner.nextInt();
            scanner.nextLine();

            switch (choicedItem){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
//                    groceryList.modifyGroceryItem();
                    modifyItem();
                    break;
                case 4:
                    searchForItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press what you choose: ");
        System.out.println("\t 0 - for print instructions");
        System.out.println("\t 1 - for print grocery List");
        System.out.println("\t 2 - for add an Item");
        System.out.println("\t 3 - for modify Item");
        System.out.println("\t 4 - for search item");
        System.out.println("\t 5 - for remove item");
        System.out.println("\t 6 - for quit");
    }

    public static void addItem(){
        System.out.print("Please enter an item: ");
        groceryList.addGroceryItem(scanner.nextLine());
        System.out.println("Item added ");
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item name ");
        String newItemName = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItemName);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.print("Enter the name of item to search for ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " is not in the list");
        }
    }
}
