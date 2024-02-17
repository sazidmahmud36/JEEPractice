package swing;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemo {
    
    private ImageIcon icon;
    
    
    FrameDemo(){
         initcomponents();
    }
    public void initcomponents(){
        icon = new ImageIcon(getClass().getResource("icon.jpeg"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        frame.setSize(400,300);
//        frame.setLocationRelativeTo(null);
//        frame.setLocation(300, 50);
        
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Demo Frame");
        frame.setResizable(false);
    }

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
