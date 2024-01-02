
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = userInput.nextInt();
        
        if(age >= 18){
            System.out.println("Valid Voter");
        }else{
            System.out.println("invalid voter");
        }
        
        
        
    }
}
