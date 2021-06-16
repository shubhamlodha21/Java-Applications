////////////////////////////////////////////////////////
//Function Name:ReplaceAll
//Input:   Shubham    L
//Output:Shubham L
//Description:Accept String from user and used ReplaceAll method
//Date: 17/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////


import java.util.*;

class ReplaceAll
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
		String temp2 = temp.replaceAll("\\s{2,}","");
		System.out.println("Modified string is : "+temp2);
	}
}




