package Area;


public class Test {
    public static void main(String[] args) {
        
        Shape[] s = new Shape[3];
        
        s[0] = new Shape();
        s[1] = new Rectangle(20,30);
        s[2] = new Triangle(10,15);
        
//        System.out.println(s[0].area());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }
        
        
        
//        Shape s = new Shape();
//        Rectangle r = new Rectangle(20,30);
//        Triangle t = new Triangle(10,15);
//        
//        System.out.println(s.area());
//        System.out.println(r.area());
//        System.out.println(t.area());
        
    }
}
