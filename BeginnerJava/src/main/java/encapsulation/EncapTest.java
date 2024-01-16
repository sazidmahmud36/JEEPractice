
package encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        
        person1.setName("sazid");
        System.out.println(person1.getName());;
        
        person1.setAge(26);
        System.out.println(person1.getAge());
    }
}
