package window;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
// import javax.swing.event.*;
// import java.time.format.DateTimeFormatter;  
// import java.time.LocalDateTime;   

public class page2 extends JPanel implements ActionListener
{
    static JFrame secondframe = new JFrame ("Shcedular");
    private JLabel jcomp1;
    //private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JComboBox<String> jcomp8;
    private JLabel jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
   

    public page2() {
    	
    	
    	setBackground(new Color(0,0,0,1));
    	
        //construct preComponents
        String[] jcomp8Items = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        //construct components
        jcomp1 = new JLabel ("CALENDER");
        
        jcomp3 = new JLabel ("STARTING TIME :");
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("DURATION :");
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("DAY :");
        jcomp8 = new JComboBox<String> (jcomp8Items);
        jcomp9 = new JLabel ("DO YOU WANT TO START THIS DAY");
        jcomp10 = new JButton ("YES");
        jcomp11 = new JButton ("NO");
       

        //set components properties
        jcomp3.setToolTipText ("When you are starting the day");
        jcomp5.setToolTipText ("For the Entire day");
        jcomp7.setToolTipText ("Select the day you are working on ");

        //adjust size and set layout
        setPreferredSize (new Dimension (700, 536));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
       

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (155, -5, 115, 65);        
        jcomp3.setBounds (55, 150, 110, 25);
        jcomp4.setBounds (200, 150, 100, 25);
        jcomp5.setBounds (55, 190, 120, 25);
        jcomp6.setBounds (200, 190, 100, 25);
        jcomp7.setBounds (55, 105, 100, 25);
        jcomp8.setBounds (200, 105, 100, 25);
        jcomp9.setBounds (55, 230, 300, 25);
        jcomp10.setBounds (75 , 260, 100, 25);
        jcomp11.setBounds (175, 260, 100, 25);

        //listener section
        jcomp10.addActionListener(this);
       
    }

    public void actionPerformed(ActionEvent e)
    {
        page3.create();
        secondframe.setVisible (false);
    }
    
    static void page2create()
    {
        
        secondframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        secondframe.setSize(900,636);
        secondframe.setContentPane(new JLabel(new ImageIcon("Pictures\\New.jpg")));
        secondframe.setLayout(new FlowLayout());
        secondframe.getContentPane().add (new page2());
        //frame.pack();
        secondframe.setVisible (true);
    }
}