
package arrayDemo;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = "+number.size());
        
        //adding number
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
//        System.out.println(number);
        for(int x: number){
            System.out.print (x+" ");
        }

//        Iterator itr = number.iterator();
//        
//        while(itr.hasNext()){
//            System.out.print(" " + itr.next());
//        }
//        
        
        System.out.println();
        System.out.println("Size = "+number.size());
        number.set(3, 50);
//        number.clear();
        System.out.println("After Clear: " + number);
        
        
        boolean check = number.isEmpty();
        System.out.println("Is empty: " + check);
        
        boolean contain = number.contains(30);
        System.out.println("30 is in the list "+contain);
        
        int x = number.get(3);
        System.out.println("index 3 = "+x);
        
        
        
        
        int pos = number.indexOf(40);
        System.out.println("Position of 40 = "+pos);
        //removing elements
        
//        number.remove(2);
//        System.out.println("After removing Arraylist elements : " + number);
//        
//        
//        number.removeAll(number);
//        System.out.println("After removing all elements : " + number);

        
    }
}
