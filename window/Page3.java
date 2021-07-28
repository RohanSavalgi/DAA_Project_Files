package window;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class page3 extends JPanel implements ActionListener
{
    static JFrame thirdframe = new JFrame ("third frame");
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    
    public page3() 
    {
    	setBackground(new Color(0,0,0,1));
    	
    	
        //construct components
        jcomp1 = new JLabel ("MONDAY");
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

        jcomp3.addActionListener(this);
        jcomp4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("YES"))
        {
            page4.create();
            thirdframe.setVisible (false);
        }
        if(e.getActionCommand().equals("NO"))
        {
            page2.secondframe.setVisible (true);
            thirdframe.setVisible (false);
        }

            
    }

    public static void create()
    {
        
        thirdframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        thirdframe.setSize(900,636);
        thirdframe.setLocationRelativeTo(page2.secondframe);
        thirdframe.setContentPane(new JLabel(new ImageIcon("Pictures\\New.jpg")));
        thirdframe.setLayout(new FlowLayout());
        thirdframe.getContentPane().add (new page3());
        //frame.pack();
        thirdframe.setVisible (true);
    }
}