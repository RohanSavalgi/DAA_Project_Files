package window;



import java.awt.*;
import javax.swing.*;
 
class Prgm3 extends JFrame {
	 private JLabel jcomp3;
    // constructor
    Prgm3()
    { 
    	 
 
        // create a new Color
        Color c = Color.yellow;
 
        // create a panel
        JPanel p = new JPanel();
 
        // set the background of the frame
        // to the specified Color
        //p.setBackground(c);
        jcomp3 = new JLabel ("STARTING TIME");
        add (jcomp3);
        setSize(200, 200);
        add(p);
        show();
    }
 
    // Main Method
    public static void main(String args[])
    {
        Prgm3 c = new Prgm3();
    }
}