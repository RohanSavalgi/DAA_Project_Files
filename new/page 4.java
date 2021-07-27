import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class page4 extends JPanel {
    private JLabel jcomp1;
    private JTextField jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JComboBox jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;

    public page4() {
    	
    	setBackground(new Color(0,0,0,1));
    	
        //construct preComponents
        String[] jcomp6Items = {"MOST IMPORTANT", "INTERMEDIATE", "LEAST IMPORTANT"};

        //construct components
        jcomp1 = new JLabel ("NAME OF THE EVENT :");
        jcomp2 = new JTextField (10);
        jcomp3 = new JLabel ("DURATION :");
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("TYPE OF EVENT :");
        jcomp6 = new JComboBox (jcomp6Items);
        jcomp7 = new JButton ("VIEW");
        jcomp8 = new JButton ("NEXT");

        //set components properties
        jcomp3.setToolTipText ("Time you want to spend on this event");

        //adjust size and set layout
        setPreferredSize (new Dimension (750, 450));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (155, 80, 155, 25);
        jcomp2.setBounds (330, 80, 190, 25);
        jcomp3.setBounds (155, 150, 100, 25);
        jcomp4.setBounds (330, 150, 100, 25);
        jcomp5.setBounds (155, 220, 115, 25);
        jcomp6.setBounds (330, 220, 160, 25);
        jcomp7.setBounds (405, 325, 100, 25);
        jcomp8.setBounds (550, 325, 100, 25);
    }


    public static void main (String[] args) 
    {
    	JFrame frame = new JFrame ("Shcedular");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,636);
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\dhanyata\\Desktop\\Rakshita S\\Mini Project\\New.jpg")));
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add (new page4());
        //frame.pack();
        frame.setVisible (true);
    }
}