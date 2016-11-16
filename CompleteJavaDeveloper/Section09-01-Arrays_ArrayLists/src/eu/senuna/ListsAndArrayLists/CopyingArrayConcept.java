package eu.senuna.ListsAndArrayLists;

import java.util.Scanner;

/**
 * Created by senuna on 16.11.16.
 */
public class CopyingArrayConcept {
    //senuna: it just shows how uneffective copying/resizing an array cuould be
    //and provides do ArrayList

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.println("enter 10 int: ");
        getInput();
        printArray(baseData);

        System.out.println("Provide new array size: ");
        int size = scanner.nextInt();
        resizeArray(size);
        printArray(baseData);
        System.out.println("Enter " + size + " int values: ");
        getInput();
        printArray(baseData);
    }


    private static void getInput(){
        for (int i = 0 ; i<baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    private static void resizeArray(int size){
        int[] original = baseData;
        baseData = new int[size];

        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }

    }

}
