
package abstraction;

public abstract class MobileUser {
    void call(){ // non abstract method
        System.out.println("Call Method");
    }
    
    abstract void sendMessage();
}
