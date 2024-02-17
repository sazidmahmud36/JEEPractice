package abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu; // Reference Variable
        
        mu = new Rahim();
        mu.sendMessage();
        mu.call();
        
        mu = new Karim();
        mu.sendMessage();
    }
}
