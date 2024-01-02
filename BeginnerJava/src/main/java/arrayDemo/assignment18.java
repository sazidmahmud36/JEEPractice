
package arrayDemo;
import java.util.Scanner;

public class assignment18 {
    public static void main(String[] args) {
        String[] days = {"monday", "tuesday", "Wednesday", "thursday", "friday", "satarday", "sunday"};
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter day number: ");
        int day = userInput.nextInt();
       
       for(int i = 0; i < days.length; i++){
           if(day == i+1){
               System.out.println("The day is : "+ days[i]);
               break;
           }
       }
       
    }
}
