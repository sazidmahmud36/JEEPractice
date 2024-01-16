
package static_method;


public class StaticBlock {
        static int id;
        static String name;
        
        static{
            id =10;
            name = "sazid";            
        }
        static void display(){
            System.out.println("Id = "+id);
            System.out.println("Name = "+name);
        }
        
}
