package SteppingStone;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println("Enter your number");
        obj.setNumber(in.next());
        System.out.println("Enter your name");
        obj.setName(in.next());
        System.out.println("Enter your account balance");
        obj.setBalance(in.nextDouble());

        obj.printInfo();
    }
}