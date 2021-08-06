/////////////////////////////////////////////////////////
//Function Name:LB31
//Input:7 
//Output:2 4 6 8 10 12 14 
//Description:program which accept one number from user and print that number of even numbers on screen
//Date: 06/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB31
{
	public static void main(String[] args) 
	{
		int iNo=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();

		for(int i=2;i<=iNo*2;i=i+2)
		{
		System.out.printf("\t"+i);
		}

	}
}