// Description : Enter a number from user and check it prime or not
// Date : 26/09/2021
// Author : Shubham Lodha

import java.util.*;

class ChkPrime
{
	boolean Chk(int iNo)
	{
		for(int i=2;i<=iNo/2;i++)
		{
			if(iNo%i==0)
			{
				return true;
			}
		}
		return false;
	}
}

class Prime
{
	public static void main(String[] args) 
	{
		int iNo=0;
		boolean bRet=false;

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sc.nextInt();

		ChkPrime obj=new ChkPrime();

		bRet=obj.Chk(iNo);
		if(bRet==true)
		{
			System.out.println("Given Number Not Prime");
		}
		else
		{
			System.out.println("Given number is  Prime");
		}
	}
}