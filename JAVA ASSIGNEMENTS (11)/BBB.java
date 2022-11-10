import java .awt.*;
import java.awt.event.*;
import javax.swing.*;

class BBB
{
	Frame mainFrame;
	Panel ControlPannel;
	Button b1,b2;
	JPanel P=new JPanel();
	Label name;
	public BBB()
	{
		mainFrame=new Frame("Marvellos Packer Unpacker");
		mainFrame.setBackground(Color.WHITE);
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});


		name =new Label("Welcome:Marevllous Ad..");
		name.setForeground(Color.blue);
		name.setBounds(10,30,400,60);
		P.setBounds(1,85,400,300);
		P.setBackground(Color.blue);
		Button b1=new Button("Pack");
		b1.setBounds(40,100,100,30);
		b1.setBackground(Color.white);

		Button b2=new Button("Unpack");
		b2.setBounds(230,100,100,30);
		b2.setBackground(Color.white);
		ControlPannel=new Panel();
		ControlPannel.setLayout(new FlowLayout());

	
		mainFrame.add(ControlPannel);
		mainFrame.add(b1);
		mainFrame.add(b2);
		mainFrame.add(P);
		mainFrame.add(name);

		mainFrame.setLayout(null);  
		mainFrame.setVisible(true);
	}

	public static void main(String arg[])
	{
		BBB obj=new BBB();
		obj.Display();
	}

	private void Display()
	{	
		b1.setActionCommand("Pack");
		    
		b1.addActionListener(new Hello());

		ControlPannel.add(b1);
		ControlPannel.add(b2);
		//name.setText("Welcome:Marevllous Ad..");

		mainFrame.setVisible(true);
	}
	     
	 private class Hello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String Command=e.getActionCommand();
			
		}
	}
}
