
package swing;

import javax.swing.JOptionPane;


public class Test2 {
    public static void main(String[] args) {
        //one parameter
//        JOptionPane.showInputDialog("Enter Your Name ");
        
        //Two Parameters
        String fName = JOptionPane.showInputDialog("Enter Your First Name ");
        
        //Four Parameters
        String lName = JOptionPane.showInputDialog(null,"Enter Your Lirst Name", "This is a title",JOptionPane.QUESTION_MESSAGE);
        
        String fullName = fName+" "+lName;
        
        JOptionPane.showMessageDialog(null, "Your full name is "+fullName);

        
    }
}
