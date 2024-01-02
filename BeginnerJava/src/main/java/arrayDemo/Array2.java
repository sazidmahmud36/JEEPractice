
package arrayDemo;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        
        System.out.print("Please Enter 5 Numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = userInput.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        

        
        System.out.println("The sum is = " + sum);       
        System.out.println("The avarage is = " + sum/number.length);
        
        double max = number[0];
        double min = number[0];
        
        for (int i = 1; i < number.length; i++) {
            if(max < number[i]){
                max = number[i];
            }
            if(min > number[i]){
                min = number[i];
            }
        }
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);

        
    }
}
