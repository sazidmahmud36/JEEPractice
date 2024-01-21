


package question2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       SavingsAccount a1 = new SavingsAccount(101,"Sumon",15000);
       SavingsAccount a2 = new SavingsAccount(102,"Arif",10000);
       SavingsAccount a3 = new SavingsAccount(103,"Rahat",7000);
       
       a1.withdraw(3000);
        System.out.println("Balance of a1 after withdrawn= "+a1.balance);
       a2.deposit(7000);
        System.out.println("Balance of a2 after deposit "+a2);
       
       ArrayList<SavingsAccount> li = new ArrayList<>();
       li.add(a1);
       li.add(a2);
       li.add(a3);
       
       
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
            
        }
       
       
       
    }
    
}
