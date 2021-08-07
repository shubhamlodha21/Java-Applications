////////////////////////////////////////////////////////
//Function Name:LB43
//Input:12
//Output:5  7   8   9  10   11
//Description:accept number from user and display all its non factors.
//Date: 07/08/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB43
{
	public static void main(String[] args) 
	{
		int iNo=0;
		int iMulti=1,iflag=1;
		int i=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();
        
        System.out.println("Non-factors are:");
		for(i=1;i<iNo;i++)
		{
			if(iNo%i!=0)
			{
				 System.out.println(+i);
			}
    	}
       
	}
}