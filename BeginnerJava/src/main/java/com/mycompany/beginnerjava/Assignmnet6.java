
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignmnet6 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a number Between 0 to 9 : ");
        int numberCheck = userInput.nextInt();
        
        if(numberCheck == 0){
            System.out.println("Zero");
        }else if(numberCheck == 1){
            System.out.println("One");
        }else if(numberCheck == 2){
           System.out.println("Two");
        }else if(numberCheck == 3){
            System.out.println("Three");
        }else if(numberCheck == 4){
            System.out.println("Four");
        }else if(numberCheck == 5){
            System.out.println("Five");
        }else if(numberCheck == 6){
            System.out.println("Six");
        }else if(numberCheck == 7){
            System.out.println("Seven");
        }else if(numberCheck == 8){
            System.out.println("Eight");
        }else if(numberCheck == 9){
            System.out.println("Nine");
        }else{
            System.out.println("Invalid Number");
        }
        
        
        
    }
}
