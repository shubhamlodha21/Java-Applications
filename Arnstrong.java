//Description : Check Whether given number is Armstrong or not
// Date : 29/09/2021
// Author : Shubham Lodha

import java.util.*;

class Display
{
	int Arm(int iNo)
	{
		int iDigit=0,iSum=0,iPow=0,iResult=1;
		int n=iNo;

		while(n!=0)
		{
			iPow++;
			n=n/10;
		}

		n=iNo;
		while(n!=0)
		{
			iDigit=n%10;
			iResult=1;

			for(int i=0;i<iPow;i++)
			{
				iResult=iResult*iDigit;
			}

			//System.out.println("iResult:"+iResult);

			iSum=iSum+iResult;
			//System.out.println("iSum:"+iSum);

			n=n/10;
		}

		if(iNo==iSum)
		{
			return 1;
		}

		else
		{
			return 0;
		}
	}
}

class Arnstrong
{
	public static void main(String[] args) 
	{
		int iNo=0,iRet=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		iNo=sc.nextInt();

		Display obj = new Display();

		iRet=obj.Arm(iNo);
		if(iRet==1)
		{
			System.out.println("Given Number is  an Arnstrong");
		}

		else
		{
			System.out.println("Given Number is Not an Arnstrong");
		}	
	}
}