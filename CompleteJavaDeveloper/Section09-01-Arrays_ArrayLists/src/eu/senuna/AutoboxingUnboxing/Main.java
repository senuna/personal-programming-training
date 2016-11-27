package eu.senuna.AutoboxingUnboxing;

import java.util.ArrayList;

/**
 * Created by senuna on 27.11.16.
 */

class IntClass{
    private int myValue;  //creating a wrapper

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Ineza");

//    ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(52));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.250);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i=0; i <=10; i++){
            intArrayList.add(Integer.valueOf(i)); //autoboxing
        }
        for(int i=0; i <=10; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue()); //unboxing
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; //myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10; dbl += 0.5){
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }

    }


}
