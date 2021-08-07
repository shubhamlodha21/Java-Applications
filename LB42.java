////////////////////////////////////////////////////////
//Function Name:LB42
//Input:12
//Output:6   4   3   2   1 
//Description:accept number from user and display its factors in decreasing order.
//Date: 07/08/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB42
{
	public static void main(String[] args) 
	{
		int iNo=0;
		int iMulti=1,iflag=1;
		int i=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();

		for(i=iNo/2;i>0;i--)
		{
			if(iNo%i==0)
			{
				 System.out.println("factors is:"+i);
			}
    	}
       
	}
}