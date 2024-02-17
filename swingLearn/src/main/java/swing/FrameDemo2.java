
package swing;
import javax.swing.JFrame;


public class FrameDemo2 extends JFrame{
    FrameDemo2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 500, 400);
        setTitle("This is a title");

    }
    
    
    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);
        
    }
}
