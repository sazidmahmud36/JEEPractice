
package oopProblem;


public class Rectangle extends Shape{
    
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    
    @Override
    void area(){
        double area = dim1*dim2;
        System.out.println("Area of Rectangle is: "+ area);
    }
}