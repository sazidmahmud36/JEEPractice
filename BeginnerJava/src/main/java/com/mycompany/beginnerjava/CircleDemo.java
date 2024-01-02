
package com.mycompany.beginnerjava;

import java.util.Scanner;


public class CircleDemo {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double radius, area;
        
        System.out.print("Enter radius : ");
        radius = userInput.nextDouble();
        
        area = 3.1416 * radius * radius;
        
        System.out.println("The area of the circle is " + area);
        
        
    }
}
