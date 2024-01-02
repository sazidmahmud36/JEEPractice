
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignmnet11 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number for factorial:");
        int factorailInput = userInput.nextInt();
        int fac = 1;
        
        if(factorailInput <= 1){
            System.out.println(fac);
        }else{
            for(int i = 2; i <= factorailInput; i++){
                fac = fac * i;
            }
            System.out.println(fac);
        }
        
    }
}
