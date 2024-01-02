
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class PatternDemo1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter Line Number: ");
        int n = userInput.nextInt();
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
        
    }
}
