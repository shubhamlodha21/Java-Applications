////////////////////////////////////////////////////////
//Function Name:Screen
//Input:--
//Output:--
//Description:Display Screen if Username and password correct otherwise Invalid..! dislpay.
//Date: 23/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Screen extends Applet implements ActionListener
{
	String msg="";
	int lcnt=0;
	Label luser,lpass;
	TextField txtuser,txtpass;
	Button blogin,bclear;

	public void init()
	{
		luser=new Label("Username");
		lpass=new Label("Password");
		txtuser=new TextField(15);
		txtpass=new TextField(15);
		blogin=new Button("LOGIN");
		bclear=new Button("CLEAR");

		add(luser);
		add(txtuser);
		add(lpass);
		add(txtpass);
		add(blogin);
		add(bclear);
		txtpass.setEchoChar('*');
		blogin.addActionListener(this);
		bclear.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==blogin)
			{
				if(txtuser.getText().equalsIgnoreCase("shubham")&&txtpass.getText().equalsIgnoreCase("shubham"))
				{
					System.out.println();
					msg="Login Sucessfully";
					lcnt=0;
				}
				else
				{
					lcnt++;
					
					msg="Wrong Password"+lcnt;
					if(lcnt==3)
					{
						throw new IllegalAccessException();
					}
				}
				repaint();
				
			}
			if(ae.getSource()==bclear)
			{
				txtuser.setText("");
				txtpass.setText("");
			}
		}
		catch(Exception e)
		{
			
			msg="Invalid login 3 times....";
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}