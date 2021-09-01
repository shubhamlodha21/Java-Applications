////////////////////////////////////////////////////////
//Function Name:LB102
//Input:5 # 4 # 3 # 2 # 1
//Output: 5
//Description:Accept number from user and display below pattern
//Date: 01/09/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB102
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=iNo;i>0;i--)
		{
			System.out.printf("%d\t#\t",i);
		}
		
	}
}