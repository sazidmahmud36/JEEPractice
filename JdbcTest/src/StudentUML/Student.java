
package StudentUML;


public class Student {
    public int age;
    public double salary;
    private String id;
    
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        int age = obj.display(21);
        System.out.println("My age is : "+age);
        
        int salary = obj.display(10000);
        System.out.println("My salary is "+ salary);
        
        
        
    }
    
    public void display(){
        System.out.println("Welcome");
    }
    public int display(int age){
        return age;
    }
    public double display(double salary){
        return salary;
    }
    
}
