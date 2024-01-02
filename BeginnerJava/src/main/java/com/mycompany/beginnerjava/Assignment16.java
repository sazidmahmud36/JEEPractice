
package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter UserName: ");
        String userName = userInput.nextLine();
        System.out.println("Enter Password: ");
        int password = userInput.nextInt();
        
//        String u = "anis";
//        int p =123456;
        if("anis".equals(userName) && password == 123456){
            System.out.println("welcome to the system");
        }else{
            System.out.println("username/password is incorrect. Please try again");
        }
    }
}
