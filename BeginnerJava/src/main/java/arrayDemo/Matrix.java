
package arrayDemo;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] A =  new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;
        
        //input
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = userInput.nextInt();
            }
        }
        //diagonal, upper, lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (A[row] == A[col]) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if(row < col){
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                
                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
                
            }
        }
        System.out.println("Sum of Diagonal Elements = "+sumOfDiagonalElements);
        System.out.println("Sum of upper Elements = "+sumOfUpperElements);
        System.out.println("Sum of lower Elements = "+sumOfLowerElements);
        
    }
}
