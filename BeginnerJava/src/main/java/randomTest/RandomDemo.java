
package randomTest;

import java.util.Random;


public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6)+5; //5 to 10
        System.out.println("Random Number = "+ randomNumber);
        
    }
}
