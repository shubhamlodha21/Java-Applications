  
////////////////////////////////////////////////////////
//Function Name:Temple
//Input:--
//Output:--
//Description:Write an Applet code to display Temple
//Date: 23/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.awt.*;
import java.applet.*;

public class Temple extends Applet
{
	boolean flag;
	public void init()
	{
		flag=false;
	}
	public void paint(Graphics g)
	{
		g.drawRect(100,100,100,100);
		g.drawLine(100,100,150,70);
		g.drawLine(150,70,200,100);
		g.drawLine(150,70,150,40);
		g.drawRect(150,40,20,20);
		g.drawLine(140,200,140,150);
		g.drawLine(160,200,160,150);
		g.drawLine(140,150,160,150);
	}
	public void stop()
	{
		flag=true;
	}
}