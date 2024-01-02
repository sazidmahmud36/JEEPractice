
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("have you completed your masters? y/n ");
        char remarkMasters = userInput.next().charAt(0);        
        System.out.println("are you fulent in English? y/n ");
        char remarkEnglish = userInput.next().charAt(0);
        
        if(remarkMasters == 'y' || remarkMasters == 'Y' && remarkEnglish == 'y'  || remarkEnglish == 'Y'){
            System.out.println("you are eligible to for the job interview");
        }else if(remarkMasters == 'n' || remarkMasters == 'N' && remarkEnglish == 'n'  || remarkEnglish == 'n'){
         System.out.println("Sorry. you are not eligible to for the job interview");
        }
        
        
    }
}
