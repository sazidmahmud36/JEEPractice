
package oop;


public class OverloadTest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(5,7);
        ob.add(5.5,17.4);
        ob.add(5,10,20);
    }
}
