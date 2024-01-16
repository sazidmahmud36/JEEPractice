
package oop;


public class Overload {
    void add(int a, int b){
        int sum = a+b;
        System.out.println("a+b = "+sum);
    }
    void add(double a, double b){
        double sum = a+b;
        System.out.println("a+b = "+sum);

    }
    void add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("a+b+c = "+sum);

    }
    void add(){
        System.out.println("Nothing to add");
    }
}
