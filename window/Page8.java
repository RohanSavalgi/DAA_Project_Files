package window;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class page8 extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;

    public page8() 
    {
    	
    	setBackground(new Color(0,0,0,1));
    	
    	
        //construct components
        jcomp1 = new JLabel ("FRIDAY");
        jcomp2 = new JLabel ("DO YOU WANT TO START A NEW EVENT ");
        jcomp3 = new JButton ("YES");
        jcomp4 = new JButton ("NO");
        jcomp5 = new JButton ("VIEW");

        //set components properties
        jcomp5.setToolTipText ("Press here to view whole day (all events)");

        //adjust size and set layout
        setPreferredSize (new Dimension (750, 450));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (310, 10, 90, 30);
        jcomp2.setBounds (225, 65, 250, 25);
        jcomp3.setBounds (230, 130, 100, 25);
        jcomp4.setBounds (350, 130, 100, 25);
        jcomp5.setBounds (605, 355, 100, 25);
    }


    public static void main (String[] args) {
    	JFrame frame = new JFrame ("Shcedular");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,636);
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\dhanyata\\Desktop\\Rakshita S\\Mini Project\\New.jpg")));
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add (new page8());
        //frame.pack();
        frame.setVisible (true);
    }
}