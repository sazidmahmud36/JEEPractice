package string_package;


public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Sazid";
        String lastName = " Mahmud";
        
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("Full Name = "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("Full Name = "+lowerName);
        
        Boolean s = firstName.startsWith("S");
        System.out.println("Start with S = "+s);
        
        Boolean e = firstName.endsWith("d");
        System.out.println("End with d = "+s);
        
        String[] students = {"sazid","mahmud","joy"};
        for (String x: students) {
            System.out.println(x);
        }
        
        
    }
}
