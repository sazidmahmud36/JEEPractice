
package oopProblem;


public class Circle extends Shape{
    
    Circle(double r){
        super(r,r);
    }
    
    void area(){
        double area = Math.PI* dim1*dim2;
        System.out.println("Area of Triangle: "+area);
    }
}
