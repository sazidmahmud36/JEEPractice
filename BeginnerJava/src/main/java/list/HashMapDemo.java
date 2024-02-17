
package list;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        //put(),get()
        HashMap<Integer, String> customer = new HashMap<Integer, String>();
        
        customer.put(101, "Rahim");
        customer.put(102, "Karim");
        customer.put(103, "Jodu");
        customer.put(104, "Modhu");
        
        System.out.println(customer.get(104));
        
    }
}
