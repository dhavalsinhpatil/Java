import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MainPage implements ActionListener
{
	JFrame f1=new JFrame("Marvellous packer unpacker");
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	JPanel p;

	MainPage()
	{
		l1=new JLabel("Username");//label
		l2=new JLabel("Password");
		l3=new JLabel("Marvellous Packer Unpacker:Login");
		
		t1=new JTextField(20);	  //textfield
		t2=new JPasswordField(20);

		b1=new JButton("SUBMIT");//button
	
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
		
	
		l1.setBounds(15,120,150,30);
		t1.setBounds(110,120,200,25);
		l2.setBounds(15,150,100,30);
		l3.setBounds(50,30,400,60);
		t2.setBounds(110,150,200,25);
		b1.setBounds(20,230,100,30);
	       	p.setBounds(0,0,400,90);
		b1.addActionListener(this);
		p.add(l3);

		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.blue);
		p.setBackground(Color.white);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1=new String();
		String s2=new String();
		s1=t1.getText();
		s2=t2.getText();
		if(s1.equals("Marvellous")&&(s1.equals("Marvellous")))
		{
			
		f1.dispose();
		Page2 p2=new Page2();
		}
	}

	public static void main(String arg[])
	{
		MainPage m1=new MainPage();
	}
}
