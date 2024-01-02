
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Product {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the id: ");
        int id = userInput.nextInt();
        
        System.out.println("Enter the title: ");
        String title = userInput.next();
        
        System.out.println("Enter the price: ");
        double price = userInput.nextDouble();
        
        System.out.println("Enter the Description: ");
        String description = userInput.next();
        
        System.out.println("Enter the category: ");
        String category = userInput.next();
        
        System.out.println(id);
        System.out.println(title);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
        
    }
}
