////////////////////////////////////////////////////////
//Function Name:FirstFrame
//Description:Created a Frame by using GUI
//Date:07/07/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class FirstFrame  extends Frame
{
	public static void main(String[] args) 
	{
			JFrame f=new JFrame("My First Frame");
			Image img=new ImageIcon("DSC_0436.jpg").getImage();
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(500,500);
			f.setLocation(100,150);
			f.setLayout(null);
			f.setIconImage(img);
			f.setPaint(Color.RED);

	}
}


