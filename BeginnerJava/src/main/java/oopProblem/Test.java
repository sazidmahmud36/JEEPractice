
package oopProblem;


public class Test {
    public static void main(String[] args) {
        Shape shape;
        
        shape = new Rectangle(30,40);
        shape.area();
        
        shape = new Triangle(10,30);
        shape.area();
        
        shape = new Circle(6);
        shape.area();
        
    }
}
