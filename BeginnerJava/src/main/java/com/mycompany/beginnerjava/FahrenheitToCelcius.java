
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        double celc, far;
        
        System.out.print("Fahrenheit : ");
        far = userInput.nextDouble();
        
        celc = 0.5556 * (far - 32);
        
        System.out.println("Celcius = " + celc);
        
        
    }
}
