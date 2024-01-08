
package string_package;


public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "This is my Country"; 
        
        String s2 = s1.replace("is", "was");
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");
        for (String x: s3) {
            System.out.println(x);
        }
                
                
                
                
    }
}
