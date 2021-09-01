////////////////////////////////////////////////////////
//Function Name:LB103
//Input:1 * 2 * 3 * 4 * 5 *
//Output: 5
//Description:Accept number from user and display below pattern
//Date: 01/09/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB103
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=1;i<=iNo;i++)
		{
			System.out.printf("%d\t*\t",i);
		}
		
	}
}