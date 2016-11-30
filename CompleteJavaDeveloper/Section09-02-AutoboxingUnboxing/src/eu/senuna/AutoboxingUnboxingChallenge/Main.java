package eu.senuna.AutoboxingUnboxingChallenge;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

/**
 * Created by senuna on 27.11.16.
 */
public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Royal Bank of Scotland ");
        bank.addBranch("Comely");

        bank.addCustomer("Comely", "Irmina", 24.23);
        bank.addCustomer("Comely", "Toi", 12354.67);
        bank.addCustomer("Comely", "Anna", 345.00);

        bank.addBranch("Princess Street");
        bank.addCustomer("Princess Street", "Maria", 6456.67);
        bank.addCustomer("Princess Street", "Artur", 89.45);

        bank.addCustomerTransaction("Princess Street", "Maria", 4.33);
        bank.addCustomerTransaction("Princess Street", "Artur", 10.55);
        bank.addCustomerTransaction("Comely","Anna",55.00);

        bank.listCustomers("Princess Street", true);
        bank.listCustomers("Comely", true);

        if (!bank.addBranch("Comely")) {
            System.out.println("Comely branch already exist");
        }

        if(!bank.addCustomerTransaction("Princess Street", "Artur", 235.85)){
            System.out.println("Customer does not exist in a branch");
        }

        if (!bank.addCustomer("Comely", "Toi", 12354.67)) {
            System.out.println("Customer already exist");
        }

        bank.addBranch("Queens");

        if (bank.addCustomer("Queens", "Hugh", 2.32) != true) {
            System.out.println("Error - Queens branch does not exist");
        }
    }
}
