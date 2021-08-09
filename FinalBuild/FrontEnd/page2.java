package FinalBuild.FrontEnd;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;  
import java.awt.geom.RoundRectangle2D;
import java.awt.Font;

public class page2 extends JPanel implements ActionListener
{
    static int counter = 0;
    static JFrame secondframe = new JFrame ("Second Frame");
    static JPanel topBar = new JPanel();
    static JPanel sideBar = new JPanel();
    static private JLabel jcomp1;
    //private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    static public JComboBox<String> jcomp8;
    private JLabel jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    private JTextField jcomp12;
    private JTextField jcomp13;

    public page2() 
    {
        
        //setBackground(new Color(51, 71, 86));
        setBackground(new Color(255, 160, 160));
        //construct preComponents
        String[] jcomp8Items = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        //construct components
        
        jcomp3 = new JLabel ("Starting Time:");
        jcomp3.setForeground(new Color(0,0,0));
        jcomp3.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp4 = new JTextField ("00",5);
        jcomp4.setBackground(new Color(162, 219, 250));
        jcomp4.setForeground(new Color(0,0,0));

        jcomp5 = new JLabel ("Duration :");
        jcomp5.setForeground(new Color(0,0,0));
        jcomp5.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp6 = new JTextField ("00",5);
        jcomp6.setBackground(new Color(162, 219, 250));
        jcomp6.setForeground(new Color(0,0,0));

        jcomp7 = new JLabel ("Day :");
        jcomp7.setForeground(new Color(0,0,0));
        jcomp7.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp8 = new JComboBox<String> (jcomp8Items);
        jcomp8.setBackground(new Color(162, 219, 250));
        jcomp8.setForeground(new Color(0,0,0));

        jcomp9 = new JLabel ("Do You Want To Start This Day");
        jcomp9.setForeground(new Color(0,0,0));
        jcomp9.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp10 = new JButton ("Yes");
        jcomp10.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp10.setBackground(new Color(162, 219, 250));
        jcomp10.setForeground(new Color(0,0,0));

        jcomp11 = new JButton ("Close");
        jcomp11.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp11.setBackground(new Color(162, 219, 250));
        jcomp11.setForeground(new Color(0,0,0));

        jcomp12 = new JTextField ("00",5);
        jcomp12.setBackground(new Color(162, 219, 250));
        jcomp12.setForeground(new Color(0,0,0));

        jcomp13 = new JTextField ("00",5);
        jcomp13.setBackground(new Color(162, 219, 250));
        jcomp13.setForeground(new Color(0,0,0));
        
        JLabel mylogo = new JLabel(new ImageIcon("Pictures\\Logo-05.png"));
        add(mylogo);
       
        //set components properties
        jcomp3.setToolTipText ("When you are starting the day");
        jcomp5.setToolTipText ("For the Entire day");
        jcomp7.setToolTipText ("Select the day you are working on ");
        jcomp4.setToolTipText ("Hours");
        jcomp12.setToolTipText ("Minutes");
        jcomp6.setToolTipText ("Hours");
        jcomp13.setToolTipText ("Minutes");

        //adjust size and set layout
        setPreferredSize (new Dimension (600, 616));
        
        setLayout (null);

        //add components
        //add (jcomp1);
        add (jcomp3);
        add (jcomp4);
        add (jcomp12);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp13);
       
        //set component bounds (only needed by Absolute Positioning)
               
        jcomp7.setBounds (55, 100, 200, 25);
        jcomp3.setBounds (55, 170, 200, 25);
        jcomp8.setBounds (250, 100, 200, 25);
        jcomp5.setBounds (55, 230, 200, 25);
        jcomp4.setBounds (250, 170, 50, 25);
        jcomp12.setBounds (310, 170, 50, 25);
        
        mylogo.setBounds(580,470,150,150);
        
        jcomp6.setBounds (250, 230, 50, 25);
        jcomp13.setBounds (310, 230, 50, 25);
        
        
        jcomp9.setBounds (55, 440, 400, 25);
        jcomp10.setBounds (95 , 500, 100, 50);
        jcomp11.setBounds (205 , 500, 100, 50);
        

        //listener section
        jcomp10.addActionListener(this);
        jcomp11.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Yes"))
        {
            secondframe.setVisible (false);
            compile.startingHour = Integer.parseInt(jcomp4.getText());
            compile.startingMin = Integer.parseInt(jcomp12.getText());
            compile.dHour = Integer.parseInt(jcomp6.getText());
            compile.dMin = Integer.parseInt(jcomp13.getText());
            compile.day = jcomp8.getSelectedItem().toString();
            

            //FinalBuild.BackEnd.event.getStartingTime();
            FinalBuild.BackEnd.event.getStartingTime();

            jcomp4.setText("00");
            jcomp12.setText("00");
            jcomp6.setText("00");
            jcomp13.setText("00");

            // System.out.println(compile.startingHour);
            // System.out.println(compile.startingMin);
            // System.out.println(compile.dHour);
            // System.out.println(compile.dMin);
            // System.out.println(compile.day);

            if(counter == 0)
            {
                page3.create();
                
                counter = 1;
            }
            else
            {
                page3.thirdframe.setVisible(true);
            }
            
        }
        if(e.getActionCommand().equals("Close"))
        {
            secondframe.dispose();
            page3.thirdframe.dispose();
            page4.fourframe.dispose();
        }
    }
    static void page2create()
    {
        //Icon closeIcon = new ImageIcon("Pictures\\close.png");
        topBar.setPreferredSize (new Dimension (900,50));
        topBar.setBackground(new Color(10, 25, 49));
        jcomp1 = new JLabel ("Calendar");
        jcomp1.setFont(new Font("Castellar", Font.BOLD,18));
		jcomp1.setFont(jcomp1.getFont().deriveFont(25.0f));
        jcomp1.setForeground(new Color(162, 219, 250));
        jcomp1.setBounds (450, 25, 115, 65); 
        page2.topBar.add(jcomp1);

        sideBar.setPreferredSize (new Dimension (200, 636));
        sideBar.setBackground(new Color(196, 182, 182));
        //44, 57, 75
        sideBar.setBounds(0,0,200, 636);
        sideBar.setLayout(new BorderLayout());
        JLabel icon = new JLabel(new ImageIcon("Pictures\\icon.png"));
        sideBar.add(icon,BorderLayout.NORTH);


        secondframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        secondframe.setSize(900,636);
        secondframe.setUndecorated(true);
        secondframe.setShape(new RoundRectangle2D.Double(0,0, 900,636, 30,30));
        secondframe.setContentPane(new JLabel(new ImageIcon("Pictures\\Logo-05.png")));
      
        secondframe.setLayout(new BorderLayout());
        secondframe.add(topBar,BorderLayout.NORTH);
        secondframe.add(sideBar,BorderLayout.WEST);
        
        secondframe.getContentPane().add (new page2());
        secondframe.setLocationRelativeTo(null);
        secondframe.setVisible (true);
    }
}