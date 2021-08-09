package FinalBuild.FrontEnd;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;

import FinalBuild.BackEnd.event;
import java.awt.geom.RoundRectangle2D;

public class page5 extends JPanel implements ActionListener
{
    static int counter = 0; 
    static SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");
    static public JLabel jcomp0 = new JLabel ("Calendar");
    static JFrame fiveframe= new JFrame ("Fourth Frame");
    static JPanel topBar = new JPanel();
    private JButton jcomp8;
    private JButton jcomp9;
    private JLabel disclamer;

    static int mondayX = 10;
    static int tuesdayX = 135;
    static int wednesdayX = 245;
    static int thursdayX = 385;
    static int fridayX = 510;
    static int saturdayX = 620;
    static int sundayX = 740;

    static int mondayBox = 115;
    static int tuesdayBox = 100;
    static int wednesdayBox = 130;
    static int thursdayBox = 115;
    static int fridayBox = 100;
    static int saturdayBox = 110;
    static int sundayBox = 100;

    final static int gap = 60;

    static int mondayGap = 0;
    static int tuesdayGap = 0;
    static int wednesdayGap = 0;
    static int thursdayGap = 0;
    static int fridayGap = 0;
    static int saturdayGap = 0;
    static int sundayGap = 0;

    static public JPanel timeTable = new JPanel();

    public page5() 
    {
    	setBackground(new Color(255, 160, 160));
        //setBackground(new Color(51, 71, 86));
        //construct preComponents
        //String[] jcomp6Items = {"Most Important", "Intermediate", "Least Impotant"};
        //construct components
        jcomp8 = new JButton ("Exit");
        jcomp8.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp8.setBackground(new Color(162, 219, 250));
        jcomp8.setForeground(new Color(0,0,0));

        jcomp9 = new JButton ("Return");
        jcomp9.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp9.setBackground(new Color(162, 219, 250));
        jcomp9.setForeground(new Color(0,0,0));

        disclamer = new JLabel();
        disclamer.setText("i");
        disclamer.setFont(new Font("Cambria", Font.ITALIC,30));
        disclamer.setToolTipText("The events that exceed the total duration will be moved to the next day");

        
        //adjust size and set layout
        setPreferredSize (new Dimension (750, 450));
        setLayout (null);

        add (jcomp8);
        add (jcomp9);
        add (disclamer);

        //set component bounds (only needed by Absolute Positioning)
        jcomp8.setBounds (550 ,520, 100, 50);
        jcomp9.setBounds (210 , 520, 150, 50);
        disclamer.setBounds(870 ,520, 30, 30);

        jcomp8.addActionListener(this);
        jcomp9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Exit"))
        {
            fiveframe.dispose();
            FinalBuild.FrontEnd.page4.fourframe.dispose();
            FinalBuild.FrontEnd.page2.secondframe.dispose();
        }
        if(e.getActionCommand().equals("Return"))
        {
            FinalBuild.FrontEnd.page5.fiveframe.setVisible(false);
            FinalBuild.FrontEnd.page2.secondframe.setVisible(true);
        }
    }
    static void firstTimeCreate()
    {
        fiveframe.setUndecorated(true);
        fiveframe.setShape(new RoundRectangle2D.Double(0 ,0 , 900,636, 30,30));
        counter = 1;
    }

    static void createPanelForEvent(FinalBuild.BackEnd.event eve)
    {
        JPanel event = new JPanel();
        event.setBackground(new Color(162, 219, 250)); 
        page5.timeTable.add(event);
        switch(eve.day)
        {
            case "MONDAY" : event.setBounds(mondayX,mondayGap + 60,mondayBox,50);
            mondayGap += gap;
            break;
            case "TUESDAY" : event.setBounds(tuesdayX,tuesdayGap + 60,tuesdayBox,50);
            tuesdayGap += gap;
            break;
            case "WEDNESDAY" : event.setBounds( wednesdayX,wednesdayGap +60,wednesdayBox,50);
            wednesdayGap += gap;
            break;
            case "THURSDAY" : event.setBounds(thursdayX,thursdayGap + 60,thursdayBox,50);
            thursdayGap += gap;
            break;
            case "FRIDAY" : event.setBounds(fridayX,fridayGap + 60,fridayBox,50);
            fridayGap += gap;
            break;
            case "SATURDAY" : event.setBounds(saturdayX,saturdayGap + 60,saturdayBox,50);
            saturdayGap += gap;
            break;
            case "SUNDAY" : event.setBounds(sundayX,sundayGap + 60,sundayBox,50);
            sundayGap+= gap;
            break;
        }
        JLabel nameOfEvent = new JLabel(eve.name);
        event.add(nameOfEvent);
        String startingTime = String.valueOf(commonDateFormat.format(eve.eventStartTime.getTime()));
        JLabel startingTimeLabel = new JLabel(startingTime);
        startingTimeLabel.setFont(new Font("Cambria", Font.BOLD,15));
        nameOfEvent.setFont(new Font("Cambria", Font.BOLD,18));
        event.add(startingTimeLabel);
    }

    static public void create()
    {
        topBar.setPreferredSize (new Dimension (900,50));
        topBar.setBackground(new Color(10, 25, 49));
        jcomp0.setFont(new Font("Castellar", Font.BOLD,18));
		jcomp0.setFont(jcomp0.getFont().deriveFont(25.0f));
        jcomp0.setForeground(new Color(62, 219, 250));
        jcomp0.setBounds (450, 10, 115, 65); 
        page5.topBar.add(jcomp0,BorderLayout.CENTER);

        //page5.timeTable.setBackground(new Color(0,0,0));
        //page5.timeTable.setBounds(50,100,800,436);
        page5.timeTable.setLayout(null);
        page5.timeTable.setBounds(25,75,850,486);

        JLabel monday = new JLabel("Monday");
        monday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel tuesday = new JLabel("Tuesday");
        tuesday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel wednesday = new JLabel("Wednesday");
        wednesday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel thursday = new JLabel("Thursday");
        thursday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel friday = new JLabel("Friday");
        friday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel saturday = new JLabel("Saturday");
        saturday.setFont(new Font("Cambria", Font.PLAIN,20));
        JLabel sunday = new JLabel("Sunday");
        sunday.setFont(new Font("Cambria", Font.PLAIN,20));


        page5.timeTable.add(monday);
        page5.timeTable.add(tuesday);
        page5.timeTable.add(wednesday);
        page5.timeTable.add(thursday);
        page5.timeTable.add(friday);
        page5.timeTable.add(saturday);
        page5.timeTable.add(sunday);

        monday.setBounds(28, 28, 92,23);
        tuesday.setBounds(145, 28, 92,23);
        wednesday.setBounds(262, 28,102,23);
        thursday.setBounds(400, 28, 92,23);
        friday.setBounds(526, 28, 92,23);
        saturday.setBounds(633, 28, 92,23);
        sunday.setBounds(758, 28, 92,23);

        System.out.println("Storage//////////////////////////////");
        // for(event i : FinalBuild.BackEnd.eventsStorage.week)
        // {
        //     i.displayData();
        // }

        for(event i : FinalBuild.BackEnd.eventsStorage.week)
        {
            createPanelForEvent(i);
        }
        FinalBuild.BackEnd.eventsStorage.week.removeAllElements();

        // monday.setBounds(28, 28, 92,23);
        // tuesday.setBounds(145, 28, 92,23);
        // wednesday.setBounds(262, 28,102,23);
        // thursday.setBounds(400, 28, 92,23);
        // friday.setBounds(526, 28, 92,23);
        // saturday.setBounds(633, 28, 92,23);
        // sunday.setBounds(758, 28, 92,23);

        // JPanel event1 = new JPanel();
        // event1.setBackground(new Color(162, 219, 250)); 

        // JPanel event2 = new JPanel();
        // event2.setBackground(new Color(162, 219, 250)); 

        // JPanel event3 = new JPanel();
        // event3.setBackground(new Color(162, 219, 250)); 

        // JPanel event4 = new JPanel();
        // event4.setBackground(new Color(162, 219, 250)); 

        // JPanel event5 = new JPanel();
        // event5.setBackground(new Color(162, 219, 250)); 

        // JPanel event6 = new JPanel();
        // event6.setBackground(new Color(162, 219, 250)); 

        // JPanel event7 = new JPanel();
        // event7.setBackground(new Color(162, 219, 250)); 


        // page5.timeTable.add(event1);
        // page5.timeTable.add(event2);
        // page5.timeTable.add(event3);
        // page5.timeTable.add(event4);
        // page5.timeTable.add(event5);
        // page5.timeTable.add(event6);
        // page5.timeTable.add(event7);

        // event1.setBounds(mondayX,60,mondayBox,50);
        // event2.setBounds(tuesdayX,60,tuesdayBox,50);
        // event3.setBounds(wednesdayX,60,wednesdayBox,50);
        // event4.setBounds(thursdayX,60,thursdayBox,50);
        // event5.setBounds(fridayX,60,fridayBox,50);
        // event6.setBounds(saturdayX,60,saturdayBox,50);
        // event7.setBounds(sundayX,60,sundayBox,50);

        fiveframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        fiveframe.setContentPane(new JLabel(new ImageIcon("Pictures\\New.jpg")));
        if(counter == 0)
        {
            firstTimeCreate();
        }
        fiveframe.setLayout(new BorderLayout());
        fiveframe.add(topBar,BorderLayout.NORTH);
        fiveframe.add(timeTable,BorderLayout.CENTER);
        fiveframe.setSize(900,636);
        fiveframe.getContentPane().add (new page5());
        fiveframe.setLocationRelativeTo(null);
        fiveframe.setVisible (true);
    } 
}