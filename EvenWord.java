////////////////////////////////////////////////////////
//Function Name:EvenWord
//Input:Shubham Lodh BMCC
//Output:Lodh BMCC
//Description:Accept String from user and return String whose length is Even
//Date: 18/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;

class Demo
{
	public void EvenWord(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		// Logic
		for(String s : Arr)
		{
			if((s.length() % 2) == 0)
			{
				System.out.println(s);
			}
		}
	}
}
class EvenWord
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.EvenWord(str);
	}
}




