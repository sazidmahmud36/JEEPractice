package StudentUML;

import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Laptop show = new Laptop();
        
        System.out.println("What is your laptop type? ");
        String s = userInput.nextLine();
        
        System.out.println("Enter Length ");
        double length = userInput.nextDouble();
        
        System.out.println("Enter width ");
        double width = userInput.nextDouble();
        
        System.out.println("Enter height");
        double height = userInput.nextDouble();
        
        double area = show.area((length*height), width);
        System.out.println("The area is "+area);
    }
}
class Laptop{
    public String type;
    public double length;
    public double width;
    private double height;
    
    public void display(){
        System.out.println("This is my laptop");
    }
    public double area(double x, double y){
        height = x;
        length = y;
        return height*length;
    }
    public String print(String s){
        type = s;
        System.out.println(type);
    }
}