
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment7 {   
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Do you love java? y/Y/n/N");
        char remark = userInput.next().charAt(0);
        
        
       
        
        if(remark == 'y' || remark == 'Y'){
            System.out.println("You are a java lover!!");
        } 
        else if(remark == 'n' || remark == 'N'){
            System.out.println("You are not a java lover!!");
        }
        else{
            System.out.println("Invalid Charecter!");
        }
        
        
    }
    
}
