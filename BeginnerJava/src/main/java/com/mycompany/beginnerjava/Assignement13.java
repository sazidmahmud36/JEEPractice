
package com.mycompany.beginnerjava;

import java.util.Scanner;


public class Assignement13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("which fibonacci number you want to see? ");
        int n = userInput.nextInt();
        
        int first = 0;
        int second = 1;
        
        int fibo = 0;
//        System.out.print( first +" " + second);
        
        for(int i = 3; i <= n; i++){
            fibo = first + second;
//            System.out.print(" "+ fibo);
            first = second;
            second = fibo;
        }
        System.out.println(fibo);
        
        
    }
}
