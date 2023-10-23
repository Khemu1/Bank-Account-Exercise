package SteppingStone;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println("Hello please Enter you Name, Number and you Balance");
        obj.setName(in.next());
        obj.setNumber(in.next());
        obj.setBalance(in.nextDouble());
        boolean exit =false;
        while (!exit)    {
            System.out.println("To display your info Enter 1");
            System.out.println("To deposit Money Enter 2 ");
            System.out.println("To withdraw Money Enter 3 ");
            System.out.println("To exit enter 4");
            String input =in.next();
            switch (String.valueOf(input)) {
                case "1" -> obj.printInfo();
                case "2" -> obj.deposit(in.nextDouble());
                case "3" -> obj.withdraw(in.nextDouble());
                case "4" -> exit = true;
                default -> System.out.println("Enter a number between 1-4");
            }
        }

    }
}