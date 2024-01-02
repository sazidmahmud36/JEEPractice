
package com.mycompany.beginnerjava;
import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = userInput.nextInt();
        System.out.print("Enter ending number: ");
        int end = userInput.nextInt();
        
        
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        
    }
    
}
 