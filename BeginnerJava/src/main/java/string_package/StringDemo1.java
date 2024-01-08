
package string_package;


public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "sazid Mahmud";
        String s2 = new String("Sazid Mahmud");
        
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of S1 = "+len);
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        
        boolean con = s1.contains("id");
        System.out.println(con);
        
        boolean emp = s1.isEmpty();
        System.out.println(emp);
        
        
    }
}
