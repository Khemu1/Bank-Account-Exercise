package SteppingStone;

public class BankAccount {
    private String number;
    private String name;
    private double balance;
    BankAccount()   {

    }
    BankAccount(String number, String name, double balance)   {
        this.name=name;
        this.number=number;
        this.balance=balance;
    }
    //
    public String getNumber() {
        return number;
    }
    public  String getName()    {
        return number;
    }
    public  double getBalance() {
        return  balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setName(String name)    {
        this.name=name;
    }
    public void setBalance(double balance)    {
        this.balance=balance;
    }
    //

    void deposit(double money) {
        if (money> 0)   {
            this.balance+=money;
            System.err.println("your bank account now contains "+this.balance);
        }
        else {
            System.out.println("nothing have been deposited");
        }
    }
    void withdraw(double money) {
        if (this.balance >=money)   {
            this.balance-=money;
            System.err.println("your bank account now contains "+this.balance);
        }
        else    {
            System.err.println("insufficient funds");
        }

    }
    void printInfo()    {
        System.err.println(this.name);
        System.err.println(this.number);
        System.err.println(this.balance);
    }
}
