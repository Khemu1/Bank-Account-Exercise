package SteppingStone;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println("Hello, please enter your Name, Number, and Balance");
        obj.setName(in.next());
        obj.setNumber(in.next());
        obj.setBalance(in.nextDouble());

        boolean exit = false;

        while (!exit) {
            System.out.println("To display your info, enter 1");
            System.out.println("To deposit Money, enter 2");
            System.out.println("To withdraw Money, enter 3");
            System.out.println("To exit, enter 4");
            String input = in.next();

            switch (input) {
                case "1" -> obj.printInfo();
                case "2" -> {
                    System.out.println("Enter the amount to deposit: ");
                    obj.deposit(in.nextDouble());
                }
                case "3" -> {
                    System.out.println("Enter the amount to withdraw: ");
                    obj.withdraw(in.nextDouble());
                }
                case "4" -> {
                    System.out.println("Exiting");
                    exit = true;
                }
                default -> System.out.println("Enter a number between 1-4");
            }
        }
    }
}
