
package question2;



public class SavingsAccount extends Account {
    int accNo;
    String accName;
    double balance;

    public SavingsAccount() {
    }

    public SavingsAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

   void deposit(double amount){
       this.balance = this.balance +amount;
   }
   
   void withdraw(double amount){
       this.balance = this.balance - amount;
       
   }

    @Override
    public String toString() {
        return "SavingsAccount{" + "accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + '}';
    }
   
   
  
    
    
    
}
