////////////////////////////////////////////////////////
//Function Name:StringAccept
//Input:Shubh Lodha
//Output:Shubh Lodha
//Description:Accept String From user and  Display the String
//Date: 12/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class StringX
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

class StringAccept
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		obj.Display(str);		
	}
}