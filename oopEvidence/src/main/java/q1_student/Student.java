
package q1_student;

public class Student {
    int id;
    String email;
    int round;
    String address;

    public Student(int id, String email, int round, String address) {
        this.id = id;
        this.email = email;
        this.round = round;
        this.address = address;
    }
    
    
    
    String showAddress(){
        return "My Address is: "+ address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", email=" + email + ", round=" + round + ", address=" + address + '}';
    }
    
    
    
}
