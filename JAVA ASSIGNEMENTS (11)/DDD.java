import java .awt.*;
import java.awt.event.*;

class DDD
{
	Frame mainFrame;
	Label Header;
	Label Status;
	//Label Pass;
	Panel ControlPannel;
	TextField t1;
	Button b1,b2;

	public DDD()
	{
		mainFrame=new Frame("Marvellos Packer Unpacker");
		mainFrame.setBackground(Color.BLUE);
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		Status=new Label();
		Status.setAlignment(Label.CENTER);

		Header=new Label();
		//Header.setAlignment();
		Header.setForeground(Color.white);
		Header.setBounds(10,50,90,60);
		t1=new TextField("");
		t1.setBounds(120,50,200,40);  

		//Pass=new Label();
		//Pass.setForeground(Color.white);
		//Pass.setAlignment(Label.CENTER);
		//Pass.setBounds(10,185,100,60);  
		
		//t2=new TextField("");
		
		//t2.setBounds(120,180,200,40);
		Button b1=new Button("Extract Here");
		b1.setBounds(50,260,70,40);
		b1.setBackground(Color.white);
		
		Button b2=new Button("PREVIOUS");
		b2.setBounds(250,260,70,40);
		b2.setBackground(Color.white);
		
		ControlPannel=new Panel();
		ControlPannel.setLayout(new FlowLayout());

		mainFrame.add(Header);
		mainFrame.add(ControlPannel);
		mainFrame.add(Status);
		//mainFrame.add(Pass);
		mainFrame.add(t1);
		//mainFrame.add(t2);
		mainFrame.add(b1);
		mainFrame.add(b2);

		mainFrame.setLayout(null);  
		mainFrame.setVisible(true);
	}

	public static void main(String arg[])
	{
		DDD obj=new DDD();
		obj.Display();
	}

	private void Display()
	{
		Header.setText("File Name");
		//Pass.setText("Password");
		
		
		b1.setActionCommand("SUBMIT");
		    
		b1.addActionListener(new Hello());

		ControlPannel.add(b1);
		ControlPannel.add(b2);
		

		mainFrame.setVisible(true);
	}
	     
	 private class Hello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String Command=e.getActionCommand();
				   
			if(Command.equals("SUBMIT"))
			{
				Status.setText("Login succesfully..");
			}
			
		}
	}
}
