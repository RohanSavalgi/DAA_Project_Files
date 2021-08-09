package FinalBuild.FrontEnd;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;  

class page1 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1;
	JLabel calender;
	public page1()
	{
		setTitle("Scheduler");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("Pictures\\900_636.jpeg")));
		setLayout(new FlowLayout());
		
		setSize(1000,636);
		setSize(900,636);

		setLocationRelativeTo(null);

	}
	public static void create()
	{
		new page1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {}
}