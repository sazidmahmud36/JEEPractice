
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double cels,far;
        
        System.out.print("Celcius : ");
        cels = userInput.nextDouble();
        
        far = 1.8 * cels + 32;
        System.out.println("Fahrenheit = " + far);
        
        
    }
}
