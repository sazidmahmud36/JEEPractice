
package overloading_constructor;


public class Teacher {
    String name,gender;
    int ph;
    
    Teacher(){
        System.out.println("No Information");
    }
    Teacher(String n, String g){
        name = n;
        gender = g;
        
    }
    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        ph = p;
    }
    
    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+ph);
        
    }
    
    
    
}
