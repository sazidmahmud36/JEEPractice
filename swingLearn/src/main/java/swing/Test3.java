
package swing;

import javax.swing.JOptionPane;

public class Test3 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do You Want To quit?", "title", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("You Clicked Yes!");
        }else{
            System.out.println("You Clicked No!");
        }
        
        
        
        
    }
}
