
package q2_banking;

public class SavingsAccount {
    int accNo;
    String accName;
    double balance;
    
//    void transfer(int account, double amount){
//        this.balance = balance - amount;
//        
//    }
    
    void deposit(double amount){
        this.balance = balance + amount;
    }
    void withdraw(double amount){
        this.balance = balance - amount;
    }
    
    
    public SavingsAccount(){
        
    }

    public SavingsAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + '}';
    }
    
    
    
}
