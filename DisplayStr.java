////////////////////////////////////////////////////////
//Function Name:DiplayStr
//Input:Shubh Lodha
//Output:Shubh Lodha
//Description:Accept String From user and returrn it
//Date: 12/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class DisplayStr
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();
		
		System.out.println("Entered string is : "+str);
	}
}