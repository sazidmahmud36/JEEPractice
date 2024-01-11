
package overloading_constructor;


public class ConstructorOverloadingTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("sazid", "male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("lisa", "female", 4567890);
        teacher3.displayInformation();
        
        
        
        
    }
}
