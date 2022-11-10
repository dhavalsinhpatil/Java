//Second JFrame
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Page4 implements ActionListener
{
	JFrame f1=new JFrame("Marvellous packer unpacker");
	JButton b1,b2;
	JPanel p;
	JLabel l1;

	Page4()
	{
		l1=new JLabel("Marvellous Packer Unpacker:Login");

		b1=new JButton("Pack");
		b2=new JButton("Unpack");

		p=new JPanel();		//panel

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setLayout(null);
		f1.getContentPane().setBackground(Color.decode("#00007F") );
		f1.getContentPane().add(b1);
		f1.getContentPane().add(b2);
		f1.add(p);

		b1.setBounds(25,160,100,30);
		b2.setBounds(250,160,100,30);
	       	p.setBounds(0,0,400,90);
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(l1);
		
		l1.setForeground(Color.blue);
		p.setBackground(Color.white);
	}
	public void actionPerformed(ActionEvent e)
	{
		f1.dispose();
		Page5 p5=new Page5();
	}
	public static void main(String arg[])
	{
		MainPage m1=new MainPage();
	}
}
