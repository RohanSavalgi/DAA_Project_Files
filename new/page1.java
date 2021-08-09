import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;  
import java.awt.geom.RoundRectangle2D;
import java.awt.Font;

class page1 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1;
	JLabel calender;
	public page1()
	{
		setTitle("Background Color for JFrame");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("Pictures\\900_636.jpeg")));
		setLayout(new FlowLayout());
		
		setSize(1000,636);
		setSize(900,636);

		int delay = 10000; 

		Timer timer = new Timer(delay, new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frameB.setVisible(true); 
				setVisible(false); 
			}
		});
		timer.start();
	}
	public static void main(String args[])
	{
		new page1();
	}
}