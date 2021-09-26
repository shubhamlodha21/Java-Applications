// Description : Enter a number from user and reverse it
// Date : 26/09/2021
// Author : Shubham Lodha


import java.util.*;


class ReverseNumber
{
	public static void main(String[] args) 
	{
		int iNo=0,rev=0,iRem=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sc.nextInt();

		while(iNo!=0)
		{
			iRem=iNo%10;
			rev=rev*10+iRem;
			iNo=iNo/10;
		}

		System.out.println("Reverse of a Number is " +rev);
	}
}