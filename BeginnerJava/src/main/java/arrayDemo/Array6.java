
package arrayDemo;


public class Array6 {
    public static void main(String[] args) {
        int[][] number = new int[4][5];
        int k = 0;
        
        //assigning the value of 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                number[row][col] = k;
                k++;
            }
        }
        
        //printing the elements
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(number[row][col]+"\t");
            }
            System.out.println();
        }
        
        
    }
}
