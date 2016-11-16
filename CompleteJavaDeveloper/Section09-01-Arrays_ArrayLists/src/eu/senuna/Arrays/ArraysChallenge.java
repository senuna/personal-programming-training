package eu.senuna.Arrays;

import java.util.Scanner;

/**
 * Created by senuna on 14.11.16.
 */
public class ArraysChallenge {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    //senuna: it's nice and usefull :)

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter number for indexes of array \r");
        int number = scanner.nextInt();

        int[] myIntegers = getIntegers(number);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);



    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        System.out.println("Please provide " + size + " integer values: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indeks " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }


//        //new array, copied from other one
//        int[] sortedArray = Arrays.copyOf(array, array.length);


        //senuna: the most important part! :)

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //be carrefull - lenght -1 - if not - ou of bound exception!
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    //senuna: ordinary swap
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
