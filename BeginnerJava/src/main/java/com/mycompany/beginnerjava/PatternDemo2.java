
package com.mycompany.beginnerjava;
import java.util.Scanner;


public class PatternDemo2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter line number: ");
        int n = userInput.nextInt();
        
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        
    }
}
