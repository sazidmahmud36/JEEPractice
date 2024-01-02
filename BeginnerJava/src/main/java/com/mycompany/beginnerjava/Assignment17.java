
package com.mycompany.beginnerjava;
import java.util.Scanner;


public class Assignment17 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter Number for Line: ");
        int n = userInput.nextInt();
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if(col %2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        
        
    }
}
