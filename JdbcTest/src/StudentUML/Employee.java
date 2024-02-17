package StudentUML;

public class Employee {
    public double age;
    private double eid;
    public String name;
    
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.show();
        
        String name = obj.display("Sazid");
        System.out.println("My name is "+ name);
        
        double eid = obj.display(1200);
        System.out.println("My eid bonus is "+ eid);
        
        
            
    }
    public void show(){
        System.out.println("I'm a employee");
    }
    public String display(String name){
        return name;
    }
    public double display(double eid){
        return eid;
    }
    
}
