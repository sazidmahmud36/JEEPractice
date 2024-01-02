
package com.mycompany.beginnerjava;

import java.util.Scanner;


public class TriangleDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double base, height, area;
        
        System.out.println("Enter the base: ");
        base = input.nextDouble();
        
        System.out.println("Enter the height: ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.println("The area is : " + area);
        
        
        
        
        
        
    }
}
