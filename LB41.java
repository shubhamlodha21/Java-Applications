////////////////////////////////////////////////////////
//Function Name:LB41
//Input:12
//Output:144
//Description:accept number from user and display its multiplication of factors
//Date: 07/08/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class LB41
{
	public static void main(String[] args) 
	{
		int iNo=0;
		int iMulti=1,iflag=1;
		int i=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();

		for(i=1;i<=iNo/2;i++)
		{
			if(iNo%i==0)
			{
				iMulti=iMulti*i;
			}
		}
        System.out.println("multiplication of factors is:"+iMulti);
	}
}