import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Page3 implements ActionListener
{
	JFrame f1=new JFrame("Marvellous packer unpacker");
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
	JPanel p;

	Page3()
	{
		l1=new JLabel("Directory name");//label
		l2=new JLabel("Destination file name");
		l3=new JLabel("Packing Portalaaa");
		
		t1=new JTextField(20);	  //textfield
		t2=new JTextField(20);

		b1=new JButton("SUBMIT");//button
		b2=new JButton("PREVIOUS");
		p=new JPanel();		//panel

		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setLayout(null);
		//f1.setBackground(Color.blue);
		 f1.getContentPane().setBackground(Color.decode("#00007F") );

		f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(p);
		f1.getContentPane().add(b1);
		f1.getContentPane().add(b2);
	
	
		l1.setBounds(15,120,150,30);
		t1.setBounds(150,120,200,25);
		l2.setBounds(15,150,100,30);
		l3.setBounds(50,30,400,60);
		t2.setBounds(150,150,200,25);
		b1.setBounds(20,230,100,30);
		b2.setBounds(200,230,100,30);
		
	       	p.setBounds(0,0,400,90);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(l3);

		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.blue);
		p.setBackground(Color.white);
	}

	public void actionPerformed(ActionEvent e)
	{
		f1.dispose();
		Page4 p4=new Page4();
	}

	public static void main(String arg[])
	{
		MainPage m1=new MainPage();
	}
}
