
package q1_student;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(101, "email@gmail.com", 57, "Dhanmondi");
        Student s2 = new Student(102, "demo@gmail.com", 55, "Gulshan");
        
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        
        System.out.println(s1.showAddress());
        System.out.println(s2.showAddress());
        
    }
}
