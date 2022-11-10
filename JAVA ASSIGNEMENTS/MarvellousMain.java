/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
*/
class MarvellousLogin extends Template implements ActionListener, Runnable
{
	JButton SUBMIT;
	JLabel label1,label2,label3,TopLabel;
	final JTextField text1,text2;
	private static int attemp = 3;

	MarvellousLogin()
	{
		TopLabel = new JLabel();
		TopLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TopLabel.setText("Marvellous Packer Unpacker : Login");
		TopLabel.setForeground(Color.BLUE);

		Dimension topsize = TopLabel.getPreferredSize();
		TopLabel.setBounds(50,40, topsize.width, topsize.height);
		_header.add(TopLabel);

		label1 = new JLabel();
		label1.setText("Username:");
		label1.setForeground(Color.white);

		Dimension size = label1.getPreferredSize();

		label1.setBounds(50,135,size.width,size.height);
		label1.setHorizontalAlignment(SwingConstants.CENTER);

		text1 = new JTextField(15);
		Dimension tsize = text1.getPreferredSize();
		text1.setBounds(200,135, tsize.width, tsize.height);

		text1.setToolTipText("ENTER USERNAME");

		label2 = new JLabel();
		label2.setText("Password:");
		label2.setBounds(50,175, size.width, size.height);
		label2.setForeground(Color.white);
		label2.setHorizontalAlignment(SwingConstants.CENTER);

		text2 = new JPasswordField(15);
		text2.setBounds(200,175, tsize.width, tsize.height);
		text2.setToolTipText("ENTER PASSWORD");

		text2.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent e)
			{

			}
			public void focusLost(FocusEvent e)
			{
				label3.setText("");
			}
		});
	
		SUBMIT=new JButton("SUBMIT");
		SUBMIT.setHorizontalAlignment(SwingConstants.CENTER);

		Dimension ssize = SUBMIT.getPreferredSize();

		SUBMIT.setBounds(50,220,ssize.width,ssize.height );

		label3 = new JLabel();
		label3.setText("");

		Dimension l3size = label3.getPreferredSize();

		label3.setForeground(Color.RED);
		label3.setBounds(50,250 , l3size.width , l3size.height);

		Thread t = new Thread(this);
		t.start();

		_content.add(label1);
		_content.add(text1);

		_content.add(label2);
		_content.add(text2);

		_content.add(label3);
		_content.add(SUBMIT);

		pack();
		validate();

		ClockHome();
		setVisible(true);
		this.setSize(500,500);
		this.setResizable(false);
		setLocationRelativeTo(null);
		SUBMIT.addActionListener(this);
 	}

	public boolean Validate(String Username, String password)
	{
		if((Username.length()<8)||(password.length() < 8))
		return false;
		else
		return true;

	}

	public void actionPerformed(ActionEvent ae)
	{
		String value1=text1.getText();
		String value2=text2.getText();

		if ( ae.getSource() == exit )
		{
			this.setVisible(false);
			System.exit(0);
		}

		if ( ae.getSource() == minimize )
		{
			this.setState(this.ICONIFIED);
		}
	
		if(ae.getSource()==SUBMIT)
		{
			if(Validate(value1,value2) == false)
			{
				text1.setText("");
				text2.setText("");
				JOptionPane.showMessageDialog(this, "Short username","Marvellous Packer Unpacker", JOptionPane.ERROR_MESSAGE);
			}
			if (value1 .equals("MarvellousAdmin") && value2.equals("MarvellousAdmin"))
			{
				NextPage page = new NextPage(value1);
				this.setVisible(false);
				page.pack();
				page.setVisible(true);
				page.setSize(500, 500);
			}
			else
			{
				attemp--;
		
				if(attemp == 0)
				{
					JOptionPane.showMessageDialog(this, "Number of attempts finished”,”Marvellous Packer Unpacker", 	JOptionPane.ERROR_MESSAGE);
					this.dispose();
					System.exit(0);
				}

				JOptionPane.showMessageDialog(this, "Incorrect login or password",
				"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void run()
	{
		for(;;)
		{
			if(text2.isFocusOwner())
			{
				if( Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK ) )
				{
					text2.setToolTipText("Warning : CAPS LOCK is on");
				}
				else
				{
					text2.setToolTipText("");
				}

				if((text2.getText()).length() < 8)
				{
					label3.setText("Weak Password");
				}
				else
				{
					label3.setText("");
				}
			}
		}
	}

	class MarvellousMain
	{
		public static void main(String arg[])
		{
			try
			{
				MarvellousLogin frame=new MarvellousLogin();
				frame.setVisible(true);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());}
			}
		}
	}
class Template extends JFrame implements Serializable , ActionListener
{
	JPanel _header;
	JPanel _content;
	JPanel _top;

	ClockLabel dayLable;
	ClockLabel timeLable;
	ClockLabel dateLable;

	JButton minimize , exit;

	public Template()
	{

	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	GridBagLayout grid = new GridBagLayout();
	setLayout(grid);
	 _top = new JPanel();
	_top.setBackground(Color.LIGHT_GRAY);

	_top.setLayout(null);

	getContentPane( ).add(_top,new GridBagConstraints(0,0,1,1,1,5,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

	_header = new JPanel();
	_header.setLayout(null);

	_header.setBackground(Color.white);

	getContentPane( ).add(_header,new GridBagConstraints(0,1,1,1,1,20,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

	_content = new JPanel();
	_content.setLayout(null);
	_content.setBackground(new Color(0,50,120));
	JScrollPanejsp=newJScrollPane(_content,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	getContentPane( ).add(jsp,new GridBagConstraints(0,2,1,1,1,75,GridBagConstraints.BASELINE,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
	setTitle("Marvellous Packer-Unpacker");

	Clock();
	CloseAndMin();
	}

	void CloseAndMin()
	{
		minimize=new JButton("-");
		minimize.setBackground(Color.LIGHT_GRAY);
		minimize.setBounds(MAXIMIZED_HORIZ,0,45,20 );

		exit=new JButton("X");
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setBackground(Color.LIGHT_GRAY);
		exit.setHorizontalTextPosition(0);
		exit.setBounds(MAXIMIZED_HORIZ+45,0,45,20 );

		_top.add(minimize);
		_top.add(exit);

		exit.addActionListener(this);
		minimize.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == exit )
		{
			this.setVisible(false);
			System.exit(0);
		}
		if ( ae.getSource() == minimize )
		{
			setState(JFrame.ICONIFIED);
		}
	}


	void Clock ()
	{
		dateLable = new ClockLabel("date");
		timeLable = new ClockLabel("time");
		dayLable = new ClockLabel("day");

		dateLable.setForeground (Color.blue);
		timeLable.setForeground (Color.blue);
		dayLable.setForeground (Color.blue);

		dayLable.setFont(new Font("Century",Font.BOLD,15));

		dayLable.setBounds(700,10,200, 100);

		dateLable.setFont(new Font("Century",Font.BOLD,15));

		dateLable.setBounds(800,-40,200, 100);

		timeLable.setFont(new Font("Century",Font.BOLD,15));

		timeLable.setBounds(760,-15,200, 100);

		_header.add(dateLable);
		_header.add(timeLable);
		_header.add(dayLable);
	}

	void ClockHome()
	{
		dateLable = new ClockLabel("date");
		timeLable = new ClockLabel("time");
		dayLable = new ClockLabel("day");

		dateLable.setForeground (Color.blue);
		timeLable.setForeground (Color.blue);
		dayLable.setForeground (Color.blue);
		dayLable.setFont(new Font("Century",Font.BOLD,15));
		dayLable.setBounds(200,20,200, 100);
		dateLable.setFont(new Font("Century",Font.BOLD,15));
		dateLable.setBounds(300,-40,200, 100);

		timeLable.setFont(new Font("Century",Font.BOLD,15));
		timeLable.setBounds(260,-10,200, 100);

		_header.add(dateLable);
		_header.add(timeLable);

		_header.add(dayLable);
	}
}


