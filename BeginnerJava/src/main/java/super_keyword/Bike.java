
package super_keyword;

public class Bike extends Vehicle{
    int gear;
    int wheel;
    
    Bike(String c, double w, int g, int wh){
        super(c,w);
        gear = g;
        wheel = wh;
    }
    
    void attribute(){
        super.attribute();
        System.out.println("Gear : "+gear);
        System.out.println("Wheel : "+wheel);
    }
}
