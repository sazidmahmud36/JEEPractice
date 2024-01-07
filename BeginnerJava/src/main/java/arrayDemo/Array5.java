
package arrayDemo;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];
        int C[][] = new int[2][3];
        
        //getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("A[" +row+"]["+col+"]=");
                A[row][col] = userInput.nextInt();
            }
        }
        
                
        //getting input for B matrix
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("B["+row+"]["+col+"]=");
                B[row][col] = userInput.nextInt();
            }
        }
        
        //printing A matrix
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col] + " ");
            }
            System.out.println();
        }


        
        //printing B matrix
        System.out.print("B =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]+" ");
            }
            System.out.println();
        }
        // sum of A and B
        System.out.print("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col];
                
                System.out.print("\t"+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
        
        

    }
}
