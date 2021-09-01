////////////////////////////////////////////////////////
//Function Name:LB105
//Input:2 4 6 8 10
//Output: 5
//Description:Accept number from user and display below pattern
//Date: 01/09/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////


import java.util.*;

class LB105
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=2;i<=iNo*2;i=i+2)
		{
			System.out.printf("%d\t",i);
		}
		
	}
}