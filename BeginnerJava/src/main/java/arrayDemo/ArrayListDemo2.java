
package arrayDemo;
import java.util.ArrayList;


public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Number 1 = "+number1);
        
        number2.add(50);
        number2.add(60);
        number2.add(70);
        number2.add(80);
        System.out.println("Number 2 = "+number2);
        
        number3.addAll(number1);
        System.out.println("Number 3 = "+ number3);
        
        
        boolean equal = number1.equals(number3);
        System.out.println("Is equal = "+equal);
        
    }
}
