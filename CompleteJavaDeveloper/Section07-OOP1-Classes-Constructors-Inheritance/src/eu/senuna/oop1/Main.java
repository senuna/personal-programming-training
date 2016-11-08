package eu.senuna.oop1;

/**
 * Created by senuna on 07.11.16.
 */
public class Main {
    public static void main(String[] args) {
        //region Car class
        Car autko = new Car();
        Car porshe = new Car();

        //senuna: it inherited bunch of methods from Java Object class
        autko.model = "CRV"; //senuna: baad idea

        System.out.println("Engine "+ autko.getEngine());
        autko.setEngine("diesel");
        System.out.println("Engine "+ autko.getEngine());
        autko.setEngine("blahblah");
        System.out.println("Engine "+ autko.getEngine());
        //endregion

        //region BankAccount challenge
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

        BankAccount mamasAccount = new BankAccount("Helena","mamas@mail.eu", 23549 );
        System.out.println(mamasAccount.getAccountNumber() + " name "+ mamasAccount.getCustomerName());
        //endregion

        //region VipCustomer Challenge
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipPerson man1 = new VipPerson();
        System.out.println(
                "Name " + man1.getName() +
                        " credit limit " + man1.getCreditLimit() +
                        " email " + man1.getEmailAdress());

        VipPerson man2 = new VipPerson("Xray Master", 10000);
        System.out.println(
                "Name " + man2.getName() +
                        " credit limit " + man2.getCreditLimit() +
                        " email " + man2.getEmailAdress());

        VipPerson man3 = new VipPerson("Dr Strange", 15000, "strange@doctor.com");
        System.out.println(
                "Name " + man3.getName() +
                        " credit limit " + man3.getCreditLimit() +
                        " email " + man3.getEmailAdress());
        //endregion

    }
}
