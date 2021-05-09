////////////////////////////////////////////////////////
//Function Name:SEquals
//Input:--
//Output:--
//Description: Sum of All Elemnts of Array
//Date: 10/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;
class SumArray
{
	public static void main(String[] args)
	{
		int iNo=0;
		int sum=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of Elements");
		 iNo=sobj.nextInt();

        int Arr[]=new int [iNo];

		System.out.println("Enter Elements:");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		for(int i=0;i<Arr.length;i++)
		{
			 sum=sum+Arr[i];
		}

		System.out.println("Sum of All Elements is:"+sum);

	}
}