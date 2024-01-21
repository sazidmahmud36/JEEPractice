
package question1;

public class Student extends Father {
    int id;
    String enail;
    int round;
   String address;
   
   
   public String showAddress(){
       return address;
       
   }

    public Student() {
    }

   
    public Student(int id, String enail, int round, String address) {
        this.id = id;
        this.enail = enail;
        this.round = round;
        this.address = address;
      
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", enail=" + enail + ", round=" + round + ", address=" + address + '}';
    }

    
    
   
    
}
