package window;
import javax.swing.*;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.*;
import java.awt.*; 
class page1 extends JPanel implements ActionListener
{
	JButton b1 = new JButton("Start!");
	public static JFrame firstframe = new JFrame ("First Frame");
	JLabel l1;
	JLabel calender;
	public page1()
	{
		setBackground(new Color(0,0,0,0));
		setSize(100,100);
		setVisible(true);


		b1.setFont(new Font("Rockwell", Font.ITALIC,40));
        b1.setBackground((new Color(10,25,51,255)));
        b1.setForeground(new Color(246,153,152,255));
		// rgba(10,25,51,255)
		//rgba(246,153,152,255)



		add(b1);

		b1.setBounds(500 , 450, 50, 50);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		page1.firstframe.dispose();
		page2.page2create();
	}

	public static void main(String[] args)
	{
		firstframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		firstframe.setSize(900,636);
		firstframe.setUndecorated(true);
        firstframe.setShape(new RoundRectangle2D.Double(0,0, 900,636, 30,30));
		firstframe.setContentPane(new JLabel(new ImageIcon("Pictures\\900_636.jpeg")));
		page1 start = new page1();
		firstframe.add(start);
		start.setBounds(500,380,200,200);
		firstframe.setLocationRelativeTo(null);
		firstframe.setVisible(true);
	}
}