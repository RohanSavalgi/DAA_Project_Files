package FinalBuild.FrontEnd;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

class page1 extends JFrame
{
	JButton b1;
	JLabel l1;
	JLabel calender;
	public page1()
	{
		setTitle("Background Color for JFrame");
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("Pictures\\900_636.jpeg")));
		setLayout(new FlowLayout());
		
		setSize(1000,636);
		setSize(900,636);

		setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0,0, 900,636, 30,30));
	}
	public static void main(String args[])
	{
		new page1();
		
	}
}