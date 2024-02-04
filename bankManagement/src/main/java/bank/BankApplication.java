package bank;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Customer Id : ");
        String customerId = sc.nextLine();
        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
        
        
    }
}
