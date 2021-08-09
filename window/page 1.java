package window;
import javax.swing.*;
import java.awt.*;
class page1 extends JFrame
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
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\dhanyata\\Desktop\\Rakshita S\\Mini Project\\900_636.jpeg")));
		setLayout(new FlowLayout());
		
		setSize(1000,636);
		setSize(900,636);
	}
	public static void main(String args[])
	{
		new page1();
	}
}