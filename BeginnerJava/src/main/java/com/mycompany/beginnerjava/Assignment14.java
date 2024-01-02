
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Start Number");
        int start = userInput.nextInt();
        
        System.out.println("End Number");
        int end = userInput.nextInt();
        int total = 0;
        
        for(int i = start; i <= end; i++){
            
            int temp = i, sum = 0;
            
            while(temp!= 0){
                int r = temp%10;
                sum = sum*10+r;
                temp = temp/10;
            }
            if(sum == i){
                total++;
                System.out.println(i);                
            }
        }
        System.out.println("Total = " + total);


        
        
    }
}
