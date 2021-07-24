package window;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Page_1 extends JFrame
{
JButton b1;
JLabel l1;
JLabel calender;
	public Page_1()
	{
		setTitle("Background Color for JFrame");
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("F:\\4thsem\\project\\WhatsApp Image 2021-07-24 at 16.31.29.jpeg")));
		setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		
		calender = new JLabel ("Calender");
		calender.setBounds(50, 50, 10, 30);
		calender.setFont(new Font("Rockwell", Font.ITALIC,18));
		calender.setFont(calender.getFont().deriveFont(50.0f));
		
		JLabel label;
		label = new JLabel("Papyrus");
	    setBounds(50, 50, 100, 30);
	    label.setFont(new Font("Comic Sans MS", Font.ITALIC,18));
	    
	    //add(label);
	    
	    
	    
	    
		//add(l1);
		add (calender);
		//add(b1);
		setSize(900,900);
		setSize(620,900);
	}
	public static void main(String args[])
	{
		new Page_1();
	}
}

