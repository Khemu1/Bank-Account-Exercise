package SteppingStone;

public class BankAccount {
    private String number;
    private String name;
    private double balance;

    // Default constructor
    BankAccount() {

    }

    // Parameterized constructor
    BankAccount(String number, String name, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    // Getters
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit money
    void deposit(double money) {
        System.out.println("Enter the amount that should be deposited");
        if (money > 0) {
            this.balance += money;
            System.err.println(money >1 ? money + " $ have been deposited to your account. Your total balance now is " + this.balance + " $":money + " $ has been deposited to your account. Your total balance now is " + this.balance + " $");
        } else {
            System.err.println("Nothing has been deposited. Invalid deposit amount.");
        }
    }

    // Withdraw money
    void withdraw(double money) {
        System.out.println("Enter the amount that should be withdrawn");
        if (this.balance >= money) {
            this.balance -= money;
            System.err.println(money >1 ? money + " $ have been withdrawn from your account. Your total balance now is " + this.balance + " $" :money + " $ has been withdrawn from your account. Your total balance now is " + this.balance + " $");
        } else {
            System.err.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Print account information
    void printInfo() {
        System.err.println("Account Holder: " + this.name);
        System.err.println("Account Number: " + this.number);
        System.err.println("Account Balance: " + this.balance + " $");
    }
}
