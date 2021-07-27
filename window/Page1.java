package window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
		Timer tm = new Timer(2000, ActionListener()) 
		{
			page1.setVisible(false);
		}
	}

	static void create()
	{
		new page1();
	}

	public void actionPerformed(ActionEvent e)
	{
		
	}
}