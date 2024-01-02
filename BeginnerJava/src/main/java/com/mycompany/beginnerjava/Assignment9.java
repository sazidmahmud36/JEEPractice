
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args){
       Scanner userInput = new Scanner(System.in);
       
       System.out.println("Press a number for language: ");
       int numberDigit = userInput.nextInt();
       
       switch(numberDigit){
            case 1:
               System.out.println("Selected language is Bengali");
               
            case 2:
                System.out.println("Selected language is Hindi");
                
            case 3:
                System.out.println("Selected language is Urdu");
            
            default:
                System.out.println("Selected language is English");
       }
       
       
       
    }
}
