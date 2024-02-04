package bank;
import java.util.Scanner;

public class BankAccount {

    double balance;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0) {
            balance = balance - amount;
            prevTrans = -amount;
        }
    }

    void getPreviousTrans() {
        if (prevTrans > 0) {
            System.out.println("Diposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No Transction Occured!");
        }
    }

    void menu() {
        
        char option;
        System.out.println("************************");
        System.out.println("Welcome " + customerName);
        System.out.println("Your Customer Id is " + customerId);
        System.out.println("-----------------------");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transction");
        System.out.println("e) Exit");

        do {
            
            System.out.println("*****************************************");
            System.out.println("Choose an option");
            Scanner sc = new Scanner(System.in);
            option = sc.next().charAt(0);
            
            
            
            switch(option){
                case 'a':
                    System.out.println("-----------------------");
                    System.out.println("Balance = "+ balance);
                    System.out.println("-----------------------");
//                    System.out.println("\n");
                    break;
                    
                case 'b':
                    System.out.println("-----------------------");
                    System.out.print("Enter amount to deposit: ");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("-----------------------");
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("-----------------------");
                    System.out.println("Enter amount to withdraw :");
                    double amtW = sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("-----------------------");
                    break;
                case 'd':
                    System.out.println("-----------------------");
                    System.out.println("Previous Transaction :");
                    getPreviousTrans();
                    System.out.println("-----------------------");
                    break;
                case 'e':
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }
            
        } while (option != 'e');
            System.out.println("Thank you for using our bank service");
    }
    
    
    
    

}
