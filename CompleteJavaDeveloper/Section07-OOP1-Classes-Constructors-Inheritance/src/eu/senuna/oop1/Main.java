package eu.senuna.oop1;

/**
 * Created by senuna on 07.11.16.
 */
public class Main {
    public static void main(String[] args) {

        Car autko = new Car();
        Car porshe = new Car();

        //senuna: it inherited bunch of methods from Java Object class
        autko.model = "CRV"; //senuna: baad idea

        System.out.println("Engine "+ autko.getEngine());
        autko.setEngine("diesel");
        System.out.println("Engine "+ autko.getEngine());
        autko.setEngine("blahblah");
        System.out.println("Engine "+ autko.getEngine());

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount inezAccount = new BankAccount();
        System.out.println("Name :" + inezAccount.getCustomerName());

        BankAccount michaelsAccount = new BankAccount(986632541, 10256325, "Michael Someone", "michal@gmail.com", 699874558);
        System.out.println("Clients name " + michaelsAccount.getCustomerName());
        System.out.println("Michaels balance " + michaelsAccount.getBalance());

        inezAccount.setAccountNumber(987654321);
        inezAccount.setBalance(2568);
        //senuna: long work... it's time for constructors

        inezAccount.withdrawal(100);

        inezAccount.deposit(10250);
        inezAccount.withdrawal(10000);

        inezAccount.deposit(50);
        inezAccount.withdrawal(302);


    }
}
