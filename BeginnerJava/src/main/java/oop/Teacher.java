
package oop;


public class Teacher {
    String name,gender;
    int phone;
    
    
    Teacher(){
        System.out.println("No Value");
    }
    
    Teacher(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }
    
//    void setInformation(String n, String g, int ph){
//        name = n;
//        gender = g;
//        phone = ph;
//        
//        
//    }
//    
    void displayInformation(){
        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Phone = " + phone);
        System.out.println("\n");
        
    }
    
}
