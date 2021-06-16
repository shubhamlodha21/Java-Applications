////////////////////////////////////////////////////////
//Function Name:CountWords  
//Input:Shubham       Lodha    s
//Output:3
//Description:Accept String from user and Count Number of Words
//Date: 17/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class CountWords
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		String temp = str.trim();
		String arr[] = temp.split("\\s");
		System.out.println("Number of words are : "+arr.length);
	}
}




