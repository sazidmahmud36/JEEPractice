
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int num, temp,sum=0, r;
        System.out.println("Enter any Number: ");
        num = userInput.nextInt();
        temp = num;
        
        while(temp != 0){
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse of the number is: "+sum);
    }
}
