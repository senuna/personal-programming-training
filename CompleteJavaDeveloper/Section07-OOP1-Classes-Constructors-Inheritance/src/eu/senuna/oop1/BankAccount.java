package eu.senuna.oop1;

/**
 * Created by senuna on 07.11.16.
 */
public class BankAccount {
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(2356, 20000, "Noname", "Unknown @ adress", 99999999); //this constructor called constructor with parameters
        System.out.println("Empty constructor ");
    }

//    public BankAccount(int accountNumber, float balance, String customerName, String email, int phoneNumber){
//
//    }

    public BankAccount(int accountNumber, float balance, String customerName, String email, int phoneNumber) {
        System.out.println("Constructor with parameters: ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public float deposit(float balance, float funds){
//        this.balance = balance+funds;
//        return this.balance;
//    }

    public void deposit(float depositFunds) {
        this.balance += depositFunds;
        System.out.println("Added " + depositFunds + " New balance " + this.balance);
    }

    public void withdrawal(double withdrawalFunds) {
        if ((this.balance - withdrawalFunds) <= 0) {
            System.out.println("Not enough money.");
        } else {
            this.balance -= withdrawalFunds;
            System.out.println(withdrawalFunds + " has been processed. Remaining: " + this.balance);
        }
    }
}
