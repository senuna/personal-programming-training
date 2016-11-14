package eu.senuna;

/**
 * Created by senuna on 14.11.16.
 */

//useful in arrays: myIntArray.length
public class Main {
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

        //endregion



    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Index " + i + " has value of " + array[i] );
        }
    }
}
