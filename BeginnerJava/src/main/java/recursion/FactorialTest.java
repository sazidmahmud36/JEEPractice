
package recursion;
import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        FactorialDemo obj = new FactorialDemo();
        
        System.out.println("Enter a number for Factorial: ");
        int num = userInput.nextInt();
        
        int fact = obj.fact(num);
        System.out.println(fact);
            
    }

}
