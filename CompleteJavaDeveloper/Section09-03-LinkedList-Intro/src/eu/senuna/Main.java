package eu.senuna;

import java.util.ArrayList;

/**
 * Created by senuna on 30.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jadzka", 25.26);
        Customer nextCustomer;
        nextCustomer = customer;
        nextCustomer.setBalance(12.65);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance() );
    // important!! it uses pointers

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
