
package q2_banking;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        SavingsAccount sazid = new SavingsAccount(100200, "Sazid", 5000);
        SavingsAccount mahmud = new SavingsAccount(100201, "Mahmud", 7000);
        SavingsAccount joy = new SavingsAccount(100202, "joy", 5500);
        
//        System.out.println(sazid.balance);
        sazid.deposit(400);
//        System.out.println(sazid.balance);
        

        ArrayList list = new ArrayList();
        
        list.add(sazid);
        list.add(mahmud);
        list.add(joy);
        
        for (Object i : list) {
            System.out.println(i);
        }
        
        
    }
}
