package FinalBuild.FrontEnd;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;



public class page4 extends JPanel implements ActionListener
{
    static int counter = 0; 
    static public JLabel jcomp0 = new JLabel ("Calendar");
    public static JFrame []array = new JFrame[100];
    static JFrame fourframe = new JFrame ("Fourth Frame");
    static JPanel topBar = new JPanel();
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
    static JPanel sideBar = new JPanel();

    public page4() 
    {
    	
    	setBackground(new Color(255, 160, 160));
        //setBackground(new Color(51, 71, 86));
        //construct preComponents
        String[] jcomp6Items = {"Most Important", "Intermediate", "Least Impotant"};
        //construct components
        jcomp1 = new JLabel ("Name of the Event :");
        jcomp1.setForeground(new Color(0,0,0));
        jcomp1.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp2 = new JTextField ("Name",10);
        jcomp2.setBackground(new Color(162, 219, 250));
        jcomp2.setForeground(new Color(0,0,0));

        jcomp3 = new JLabel ("Duration :");
        jcomp3.setForeground(new Color(0,0,0));
        jcomp3.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp4 = new JTextField ("00",5);
        jcomp4.setBackground(new Color(162, 219, 250));
        jcomp4.setForeground(new Color(0,0,0));

        jcomp10 = new JTextField ("00",5);
        jcomp10.setBackground(new Color(162, 219, 250));
        jcomp10.setForeground(new Color(0,0,0));

        jcomp5 = new JLabel ("Type of Event :");
        jcomp5.setForeground(new Color(0,0,0));
        jcomp5.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp6 = new JComboBox<String> (jcomp6Items);
        jcomp6.setBackground(new Color(162, 219, 250));
        jcomp6.setForeground(new Color(0,0,0));

        jcomp7 = new JButton ("Generate");
        jcomp7.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp7.setBackground(new Color(162, 219, 250));
        jcomp7.setForeground(new Color(0,0,0));

        jcomp8 = new JButton ("Next");
        jcomp8.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp8.setBackground(new Color(162, 219, 250));
        jcomp8.setForeground(new Color(0,0,0));

        jcomp9 = new JButton ("Return");
        jcomp9.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp9.setBackground(new Color(162, 219, 250));
        jcomp9.setForeground(new Color(0,0,0));
        
        //set components properties
        jcomp3.setToolTipText ("Time you want to spend on this event");
        jcomp2.setToolTipText ("Enter the name of the event");
        jcomp4.setToolTipText ("Hours");
        jcomp9.setToolTipText ("Return to starting page");
        jcomp10.setToolTipText ("Minutes");

        JLabel mylogo = new JLabel(new ImageIcon("Pictures\\Logo-05.png"));
        add(mylogo);
        
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
        jcomp1.setBounds (55, 80, 200, 25);
        jcomp2.setBounds (330, 80, 190, 25);
        jcomp3.setBounds (55, 150, 200, 25);
        jcomp4.setBounds (330, 150, 50, 25);
        jcomp10.setBounds (390, 150, 50, 25);
        jcomp5.setBounds (55, 220, 200, 25);
        jcomp6.setBounds (330, 220, 160, 25);
        jcomp7.setBounds (395, 400 , 160, 50);//55
        jcomp8.setBounds (250 ,400, 100, 50);
        jcomp9.setBounds (55 , 400, 150, 50);
        
        mylogo.setBounds(580,470,150,150);

        jcomp8.addActionListener(this);
        jcomp9.addActionListener(this);
        jcomp7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Next"))
        {
            compile.nameOfEvent = jcomp2.getText();
            compile.dhEvent = Integer.parseInt(jcomp4.getText());
            compile.dmEvent = Integer.parseInt(jcomp10.getText());
            compile.bucket = jcomp6.getSelectedItem().toString();

            // System.out.println(compile.nameOfEvent);
            // System.out.println(compile.dhEvent);
            // System.out.println(compile.dmEvent);
            // System.out.println(compile.bucket);

            for(FinalBuild.BackEnd.event i : FinalBuild.BackEnd.mainprocess.singleDay)
            {
                i.day = FinalBuild.FrontEnd.compile.day;
            }

            FinalBuild.BackEnd.event thisEvent = new FinalBuild.BackEnd.event();
            if(FinalBuild.BackEnd.event.eventsCounter == 1)
            {
                FinalBuild.BackEnd.event.getStartingTime();
            }
            thisEvent.collectData(thisEvent);
            thisEvent.day = FinalBuild.FrontEnd.compile.day;
            FinalBuild.BackEnd.mainprocess.singleDay.addElement(thisEvent);
            
            jcomp10.setText("00");
            jcomp4.setText("00");

            fourframe.setVisible(false);
            page4.create();
        }
        if(e.getActionCommand().equals("Return"))
        {
            page4.fourframe.setVisible(false);
            page2.secondframe.setVisible(true);
        }
        if(e.getActionCommand().equals("Generate"))
        {
            FinalBuild.BackEnd.mainprocess.processingAfterInputs();
            FinalBuild.FrontEnd.page5.create();
        }
    }

    static void firstTimeCreate()
    {
        fourframe.setUndecorated(true);
        fourframe.setShape(new RoundRectangle2D.Double(0,0, 900,636, 30,30));
        counter = 1;
    }

    static void create()
    {
        topBar.setPreferredSize (new Dimension (900,50));
        topBar.setBackground(new Color(10, 25, 49));
        jcomp0.setFont(new Font("Castellar", Font.BOLD,18));
		jcomp0.setFont(jcomp0.getFont().deriveFont(25.0f));
        jcomp0.setForeground(new Color(62, 219, 250));
        jcomp0.setBounds (450, 10, 115, 65); 
        page4.topBar.add(jcomp0,BorderLayout.CENTER);

        sideBar.setPreferredSize (new Dimension (200, 636));
        sideBar.setBackground(new Color(196, 182, 182));
        sideBar.setBounds(0,0,200, 636);
        sideBar.setLayout(new BorderLayout());
        JLabel icon = new JLabel(new ImageIcon("Pictures\\icon.png"));
        sideBar.add(icon,BorderLayout.NORTH);
        

        fourframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        fourframe.setContentPane(new JLabel(new ImageIcon("Pictures\\Logo-05.png")));
        if(counter == 0)
        {
            firstTimeCreate();
        }
        fourframe.setLayout(new BorderLayout());
        fourframe.add(topBar,BorderLayout.NORTH);
        fourframe.add(sideBar,BorderLayout.WEST);
        fourframe.setSize(900,636);
        fourframe.getContentPane().add (new page4());
        //frame.pack();
        fourframe.setLocationRelativeTo(null);
        fourframe.setVisible (true);
    } 
}