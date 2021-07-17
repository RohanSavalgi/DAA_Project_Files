package GuiFiles;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class startingPage extends JPanel {
    private JLabel applicationName;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JButton jcomp5;
    private JLabel jcomp6;
    private JTextArea jcomp7;
    private JLabel jcomp8;
    private JPasswordField jcomp9;
    private JLabel jcomp10;
    private JComboBox Time;
    private JComboBox jcomp12;
    private JComboBox jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JComboBox jcomp16;
    private JLabel jcomp17;

    public startingPage() {
        //construct preComponents
        String[] TimeItems = {"9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"};
        String[] jcomp12Items = {"00 min", "15 min", "30 min", "45 min", "50 min"};
        String[] jcomp13Items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] jcomp16Items = {"00", "15 ", "30", "45", "50"};

        //construct components
        applicationName = new JLabel ("Calendar");
        jcomp2 = new JLabel ("Enter the following Details...");
        jcomp3 = new JLabel ("Starting Time : ");
        jcomp4 = new JLabel ("Total Duration : ");
        jcomp5 = new JButton ("Continue");
        jcomp6 = new JLabel ("Name : ");
        jcomp7 = new JTextArea (5, 5);
        jcomp8 = new JLabel ("Password : ");
        jcomp9 = new JPasswordField (5);
        jcomp10 = new JLabel (":");
        Time = new JComboBox (TimeItems);
        jcomp12 = new JComboBox (jcomp12Items);
        jcomp13 = new JComboBox (jcomp13Items);
        jcomp14 = new JLabel ("Hour(s)");
        jcomp15 = new JLabel (":");
        jcomp16 = new JComboBox (jcomp16Items);
        jcomp17 = new JLabel ("Minutes");

        //set components properties
        jcomp4.setToolTipText ("Total amount of time avaliable in that day");
        jcomp5.setToolTipText ("Press to continue to the next page");
        jcomp6.setToolTipText ("Username");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 581));
        setLayout (null);

        //add components
        add (applicationName);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (Time);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);

        //set component bounds (only needed by Absolute Positioning)
        applicationName.setBounds (0, 0, 75, 30);
        jcomp2.setBounds (15, 60, 180, 25);
        jcomp3.setBounds (15, 170, 100, 25);
        jcomp4.setBounds (15, 210, 95, 25);
        jcomp5.setBounds (735, 495, 175, 65);
        jcomp6.setBounds (15, 100, 100, 25);
        jcomp7.setBounds (110, 105, 120, 20);
        jcomp8.setBounds (15, 125, 100, 25);
        jcomp9.setBounds (110, 130, 120, 20);
        jcomp10.setBounds (170, 170, 15, 25);
        Time.setBounds (110, 170, 60, 25);
        jcomp12.setBounds (175, 170, 80, 25);
        jcomp13.setBounds (110, 210, 50, 25);
        jcomp14.setBounds (160, 210, 50, 25);
        jcomp15.setBounds (210, 210, 10, 25);
        jcomp16.setBounds (220, 210, 45, 25);
        jcomp17.setBounds (265, 210, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Calender");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new startingPage());
        frame.pack();
        frame.setVisible (true);
    }
}

