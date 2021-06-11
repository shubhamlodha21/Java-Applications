////////////////////////////////////////////////////////
//Function Name:EvenSum
//Input:5  (10  22  30  40  55)
//Output:80
//Description:Accept n Number From User And Return addition of Even Numbers
//Date: 11/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i]%2==0)
			{
			iSum = iSum + Arr[i];
		    }
		}
		return iSum;
	}
}
class EvenSum
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Enter number of elements\n");
		iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		System.out.println("Please enter the values");
		for(int i = 0; i < Arr.length; i++)
		{

			Arr[i] = sobj.nextInt();
		}
		Numbers nobj = new Numbers();
		int iRet = nobj.Sum(Arr);
		System.out.println("Addition of N numbers : "+iRet);
	}
}