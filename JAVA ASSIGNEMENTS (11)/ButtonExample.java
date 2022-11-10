import java.awt.event.*;  
import javax.swing.*;    

public class ButtonExample 
{  
	public static void main(String[] args)
	 {  
	    JFrame f=new JFrame("Mravellou");  
	    JLabel l1,l2;
	    l1=new JLabel("Username");
	    l1.setBounds(48,51,154,20);
	    l2=new JLabel("Password");
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	   // JButton b=new JButton("Click Here");  
	    //b.setBounds(50,100,95,30);  
	 //   b.addActionListener(new ActionListener()
		{  
		 	public void actionPerformed(ActionEvent e)
			{  
		            tf.setText("Welcome to Javatpoint.");  
		        }  
	    });  
   // f.add(b);
	f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
