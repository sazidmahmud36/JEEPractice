package string_package;


public class StringDemo3 {
    public static void main(String[] args) {
        String country = "Bangladesh Is my Country";
        System.out.println(country);
        
        char ch = country.charAt(0);
        System.out.println("Ch = "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Value = "+value);
        
        int pos = country.indexOf('n');
        System.out.println("First position of n = "+pos);
        
        pos = country.lastIndexOf('n');
        System.out.println("Last index ofn = "+pos);
        
        
        
    }
}
