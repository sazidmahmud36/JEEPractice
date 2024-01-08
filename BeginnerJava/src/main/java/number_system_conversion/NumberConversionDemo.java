
package number_system_conversion;

public class NumberConversionDemo {
    public static void main(String[] args) {
//        Binary,octal,hexadecimal to Decimal
        String hexadecimal = "A";
        Integer decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);
        
//        Decimal to Binary,octal,hexadecimal
        int dec = 15;
        String binary = Integer.toBinaryString(dec);
        System.out.println(binary);
        
        String octal = Integer.toOctalString(dec);
        System.out.println(octal);
        
        String hexa = Integer.toHexString(dec);
        System.out.println(hexa);
        
        
        
        
        
    }
}
