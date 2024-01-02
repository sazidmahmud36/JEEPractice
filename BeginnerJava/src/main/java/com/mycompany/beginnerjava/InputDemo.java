
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a double number : ");
        double inputDouble = userInput.nextDouble();
        
        System.out.println(inputDouble);
        
    }
}
