
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignemnt15 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter start number:");
        int m = userInput.nextInt();
        System.out.println("Enter end number:");
        int n = userInput.nextInt();
        int count = 0;
        
        for(int i = m; i <= n; i++){
            int temp = i, r, sum = 0;
            
            while(temp != 0){
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
            if(sum == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total = " + count);
                
    }
}
