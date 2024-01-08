
package string_package;

public class StringDemo7 {
    public static void main(String[] args) {
        
//        Primative to string
        double i = 100;
        String x = Double.toString(i);
        System.out.println(x);
        
//        String to Primative

        String s = "32";
        double j = Double.parseDouble(s);
        System.out.println(j);
        
        
    }
}
