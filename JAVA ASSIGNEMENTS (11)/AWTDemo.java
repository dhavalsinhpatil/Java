import java .awt.*;
import java.awt.event.*;

class AWTDemo
{
	Frame mainFrame;
	Label Header;
	Label Status;
	Panel ControlPannel;
	TextField name,pass;

	public AWTDemo()
	{
		mainFrame=new Frame("Marvellos Packer Unpacker");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		Status=new Label("Username");
		Status.setAlignment(Label.CENTER);
		Header=new Label("Password");
		Header.setAlignment(Label.CENTER);
		Status.setSize(350,100);
	
		ControlPannel=new Panel();
		ControlPannel.setLayout(new FlowLayout());

		mainFrame.add(Header);
		mainFrame.add(ControlPannel);
		mainFrame.add(Status);
			  
		mainFrame.setVisible(true);
	}

	public static void main(String arg[])
	{
		AWTDemo obj=new AWTDemo();
		obj.Display();
	}

	private void Display()
	{
		//Header.setText("please select batch");
		
		Button b1=new Button("Submit");
		//Button Anguler=new Button("Anguler");

		b1.setActionCommand("Submit");
		//Anguler.setActionCommand("Anguler");
		    
		b1.addActionListener(new Hello());
		//Anguler.addActionListener(new Hello());

		ControlPannel.add(b1);
		//ControlPannel.add(Anguler);
		 name=new TextField(30);
	        pass=new TextField(30);
		mainFrame.setVisible(true);
	}
	     
	 private class Hello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String Command=e.getActionCommand();
				   
			if(Command.equals("Submit"))
			{
				Status.setText("PPA batch is selected");
			}
			
		}
	}
}
