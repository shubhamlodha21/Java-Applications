////////////////////////////////////////////////////////
//Function Name:RemoveWhtSpc
//Input:Shubham       Lodha    s
//Output:Shubham Lodha s
//Description:Accept String from user and remove white spaces 
//Date: 17/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////


import java.util.*;

class RemoveWhtSpc
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		System.out.println("New string length after removing extra white spaces : "+temp.length());
		System.out.println("Modified string is : "+temp);
	}
}




