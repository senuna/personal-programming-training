package eu.senuna.Arrays;

import java.util.Scanner;

/**
 * Created by senuna on 14.11.16.
 */

//useful in arrays: myIntArray.length
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //region intro to arrays
        //int[] myIntArray = {1,12,24,35,44,56,69,712,82,95};
        int[] myIntArray = new int[10];

        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i]=i*3;
        }

        printArray(myIntArray);

        //myIntArray[5] = 50;

        double[] myDoubleAray;
        myDoubleAray = new double[10];

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[9]);
        //endregion

        //region
        //given code had cardcoded 5 indexes array - I changed it to provided by user

        int[] myIntegeres = getIntegers();
        for (int i = 0; i < myIntegeres.length; i++ ){
            System.out.println("Element " + i + " was given value " + myIntegeres[i]);
        }

        System.out.println("Average is " + getAverage(myIntegeres));
        //endregion

    }

    public static int[] getIntegers(){
        System.out.println("enter number for indexes of array");
        int number = scanner.nextInt();
        System.out.println("Your chosen number is " + number);

        int[] values = new int[number];

        for(int i = 0 ; i < values.length; i++){
            System.out.println("enter number for fill array index " + i );
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i <array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Index " + i + " has value of " + array[i] );
        }
    }
}
