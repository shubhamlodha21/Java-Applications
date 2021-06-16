////////////////////////////////////////////////////////
//Function Name:TrimMethod
//Input:    Shubham  Lodha       
//Output:Shubham Lodha
//Description:Accept String from user and remove white spaces at end and starting of string using trim method
//Date: 17/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class TrimMethod
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		String temp = str.trim();
		System.out.println("New string is : "+temp);
		System.out.println("Length of new string is : "+temp.length());
	}
}




