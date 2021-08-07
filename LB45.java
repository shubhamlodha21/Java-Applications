////////////////////////////////////////////////////////
//Function Name:LB45
//Input:12
//Output:-34
//Description:Write a program which accept number from user and return difference between summation of all its factors and non factors. 
//Date: 07/08/2021
//Author: Shubham Lodha
/////////////////////////////////////////////////////


import java.util.*;

class LB45
{
	public static void main(String[] args) 
	{
		int iNo=0;
		int iSum=0,iSum2=0,iflag=1;
		int i=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();
        
       
		for(i=1;i<iNo;i++)
		{
			if(iNo%i==0)
			{
				 iSum=iSum+i;
			}
    	}

    	for(i=1;i<iNo;i++)
		{
			if(iNo%i!=0)
			{
				 iSum2=iSum2+i;
			}
    	}

 System.out.println("Difference Between Factors ANd Non-factors Summations is:"+(iSum-iSum2));
       
	}
}