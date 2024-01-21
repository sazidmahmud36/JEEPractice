
package question1;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(101, "abc@gmail.com", 57, "Dhaka");
        Student s2 = new Student(102, "ac@gmail.com", 58, "Cumilla");
        
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
            
        }
        
    }
    
}
