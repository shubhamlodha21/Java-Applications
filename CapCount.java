////////////////////////////////////////////////////////
//Function Name:CapCount
//Input:Shubh Lodha
//Output:2
//Description:Accept String From user and  Count Captial Letters
//Date: 12/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class StringX
{
	public int CapCount(String str)
	{
		char arr[] = str.toCharArray();
		int iCnt = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if((arr[i] >= 'A') && (arr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class CapCount
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		int iRet = obj.CapCount(str);
		System.out.println("Number of capital letters are : "+iRet);		
	}
}