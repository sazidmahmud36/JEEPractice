
package dialog;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MessageDialog1 {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("test.png");
        
            //2 parameter
//        JOptionPane.showMessageDialog(null, "Wrong Password!");

            //4 parameter
//        JOptionPane.showMessageDialog(null, "Worng Password!", "Warning", JOptionPane.ERROR_MESSAGE);


//        JOptionPane.showMessageDialog(null, "wrong pass", "Warning", JOptionPane.QUESTION_MESSAGE);
        
//5 parameter CustomIcon
        JOptionPane.showMessageDialog(null, "Enter a right password!", "Warning", JOptionPane.PLAIN_MESSAGE,img);
        
    }
}