
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.println("Enter any number: ");
        num = userInput.nextInt();
        temp = num;
        
        while(temp != 0){
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
        
        if (sum == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        
        
    }
}
