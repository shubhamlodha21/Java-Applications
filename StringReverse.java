////////////////////////////////////////////////////////
//Function Name:StringReverse
//Input:Shubham 
//Output:mahbuhS
//Description:Accept String from user and display in Reverse Order
//Date: 18/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



import java.util.*;

class Demo
{
	public void ReverseDisplay(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		for(int i = 0; i < Arr.length; i++)
		{
			StringBuffer bobj = new StringBuffer(Arr[i]);
			System.out.println(bobj.reverse());	
			bobj = null;		
		}
	}
}

class StringReverse
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.ReverseDisplay(str);
	}
}




































