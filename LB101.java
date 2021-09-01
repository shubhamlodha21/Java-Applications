////////////////////////////////////////////////////////
//Function Name:LB101
//Input:A B C D E
//Output: 5
//Description:Accept number from user and display below pattern
//Date: 01/09/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB101
{
	public static void main(String[] args) 
	{
		int iNo;
		char ch='A';

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=ch;i<=ch+iNo;i++)
		{
			System.out.printf("%c\t",i);
		}
		
	}
}