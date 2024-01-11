package oop;


public class WrapperDemo {
    public static void main(String[] args) {
        

//primative to object        
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("Y = "+y);
        
        Integer z = x;//Integer.valueOf(); - Autoboxing
        System.out.println("Z = "+z);
        
//        Object to Primative
        Double d = new Double(10.25);
        System.out.println("d = "+d );
        
//        Double e = d.doubleValue();
        Double e = d; // d.doubleValue(); - unboxing
        System.out.println("e = "+e);
        
        
        
        
        
        
    }
}
