
package arrayDemo;

public class Array3 {
    public static void main(String[] args) {
         String[] names = {"Sazid", "Mahmud", "Pranto", "Rasel", "Shipon"};
         int[] num = {10,20,30,40,50,60,70,80,90,100};
         int sum = 0;
         
//         System.out.println(names.length);

        for(String x: names){
            System.out.println(x);
        }
         
        for(int y: num){
            sum = sum+y;
        }
        System.out.println(sum);

        
    }
}
