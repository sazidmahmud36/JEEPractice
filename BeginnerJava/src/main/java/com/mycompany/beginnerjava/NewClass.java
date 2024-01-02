
package com.mycompany.beginnerjava;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Starting Number: ");
        int m = input.nextInt();
        
        System.out.print("Ending Number: ");
        int n = input.nextInt();
        
        int totalArmstrongNumber=0;
        
        for(int i = m; i <= n; i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                int r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }
            if(sum==i){
                System.out.print(i+" ");
                totalArmstrongNumber++;
            }
        }
        System.out.println("Total Armstrong Number: "+totalArmstrongNumber);
    }
}
