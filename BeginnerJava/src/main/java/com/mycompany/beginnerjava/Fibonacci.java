
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);
         
         System.out.println("How many numbers : ");
         int n = userInput.nextInt();
         
         int first = 0;
         int second = 1;
         int fibo;
         System.out.print( first+" "+ second);
         
         for (int i = 3; i <= n; i++) {
            fibo = first+second;
             System.out.print(" " + fibo);
            first = second;
            second = fibo;
        }
         System.out.println("");
    }
}
