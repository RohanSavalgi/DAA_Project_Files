package window;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class page4 extends JPanel implements ActionListener
{
    static JFrame fourframe = new JFrame ("Scheduler");
    private JLabel jcomp1;
    private JTextField jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JTextField jcomp10;
    private JLabel jcomp5;
    private JComboBox<String> jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;

    public page4() 
    {
    	
    	setBackground(new Color(0,0,0,1));
        //construct preComponents
        String[] jcomp6Items = {"MOST IMPORTANT", "INTERMEDIATE", "LEAST IMPORTANT"};

        //construct components
        jcomp1 = new JLabel ("NAME OF THE EVENT :");
        jcomp2 = new JTextField (10);
        jcomp3 = new JLabel ("DURATION :");
        jcomp4 = new JTextField ("00",5);
        jcomp10 = new JTextField ("00",5);
        jcomp5 = new JLabel ("TYPE OF EVENT :");
        jcomp6 = new JComboBox<String> (jcomp6Items);
        jcomp7 = new JButton ("VIEW");
        jcomp8 = new JButton ("NEXT");
        jcomp9 = new JButton ("RETURN");
        
        //set components properties
        jcomp3.setToolTipText ("Time you want to spend on this event");
        jcomp2.setToolTipText ("Enter the name of the event");
        jcomp4.setToolTipText ("Hours");
        jcomp9.setToolTipText ("Return to starting page");
        jcomp10.setToolTipText ("Minutes");

        //adjust size and set layout
        setPreferredSize (new Dimension (750, 450));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp10);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (155, 80, 155, 25);
        jcomp2.setBounds (330, 80, 190, 25);
        jcomp3.setBounds (155, 150, 100, 25);
        jcomp4.setBounds (330, 150, 50, 25);
        jcomp10.setBounds (390, 150, 50, 25);
        jcomp5.setBounds (155, 220, 115, 25);
        jcomp6.setBounds (330, 220, 160, 25);
        jcomp7.setBounds (405, 325, 100, 25);
        jcomp8.setBounds (550, 325, 100, 25);
        jcomp9.setBounds (260, 325, 100, 25);

        jcomp8.addActionListener(this);
        jcomp9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("NEXT"))
        {
            compile.nameOfEvent = jcomp2.getText();
            compile.dhEvent = Integer.parseInt(jcomp4.getText());
            compile.dmEvent = Integer.parseInt(jcomp10.getText());
            compile.bucket = jcomp6.getSelectedItem().toString();

            System.out.println(compile.nameOfEvent);
            System.out.println(compile.dhEvent);
            System.out.println(compile.dmEvent);
            System.out.println(compile.bucket);

            jcomp10.setText("00");
            jcomp4.setText("00");

            fourframe.setVisible(false);
            page4.create();
        }
        if(e.getActionCommand().equals("RETURN"))
        {
            page4.fourframe.setVisible(false);
            page2.secondframe.setVisible(true);
        }
    }

    static void create()
    {
        
        fourframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        fourframe.setContentPane(new JLabel(new ImageIcon("Pictures\\New.jpg")));
        fourframe.setLayout(new FlowLayout());
        fourframe.setSize(900,636);
        fourframe.getContentPane().add (new page4());
        //frame.pack();
        fourframe.setLocationRelativeTo(null);
        fourframe.setVisible (true);
    } 
}