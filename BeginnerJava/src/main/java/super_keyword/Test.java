package super_keyword;

public class Test {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
        Car volvo = new Car("White",500,7);
        volvo.attribute();
        
        Bike monoton = new Bike("Black", 135, 5, 2);
        monoton.attribute();
        
    }
}
