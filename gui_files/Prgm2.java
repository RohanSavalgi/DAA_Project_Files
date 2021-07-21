package window;



import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class Prgm2 extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JComboBox jcomp8;
    private JButton jcomp9;
   

    public Prgm2() {
    	
    	
       
    	
        //construct preComponents
        String[] jcomp8Items = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        //construct components
        jcomp1 = new JLabel ("CALENDER");
        
        jcomp3 = new JLabel ("STARTING TIME :");
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("DURATION :");
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("DAY :");
        jcomp8 = new JComboBox (jcomp8Items);
        jcomp9 = new JButton ("CONTINUE");
       

        //set components properties
        jcomp3.setToolTipText ("When you are starting the day");
        jcomp5.setToolTipText ("For the Entire day");
        jcomp7.setToolTipText ("Select the day you are working on ");

        //adjust size and set layout
        setPreferredSize (new Dimension (418, 360));
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
       

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (155, -5, 115, 65);
        
        jcomp3.setBounds (55, 150, 110, 25);
        jcomp4.setBounds (200, 150, 100, 25);
        jcomp5.setBounds (55, 190, 270, 25);
        jcomp6.setBounds (200, 190, 100, 25);
        jcomp7.setBounds (55, 105, 100, 25);
        jcomp8.setBounds (200, 105, 100, 25);
        jcomp9.setBounds (300, 320, 100, 25);
       
    }
    


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Prgm2 ());
       
        frame.pack();
        frame.setVisible (true);
        
       
    }}



