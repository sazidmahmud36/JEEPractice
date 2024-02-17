
package list;

import java.util.LinkedList;


public class StudentListDemo {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        
        Student s1 = new Student(101, "Rahim", "Eight");
        Student s2 = new Student(102, "Karim", "Nine");
        Student s3 = new Student(103, "Jodu", "Ten");
        Student s4 = new Student(104, "Modhu", "Eleven");
        Student s5 = new Student(105, "Khadu", "Twelve");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        
        for(Student s : list){
            System.out.println(s.id + " " + s.name + " " + s.className);
        }
        
        
    }
}
