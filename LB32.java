/////////////////////////////////////////////////////////
//Function Name:LB32
//Input:24
//Output:1 2 4 6 8 12
//Description:Write a program which accept number from user and print even factors of that number
//Date: 06/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB32
{
	public static void main(String[] args) 
	{
		int iNo=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number:");
		iNo=sobj.nextInt();

		for(int i=2;i<=iNo/2;i=i+2)
		{
		   if(iNo%i==0)
		 { 	
		   	System.out.println(" "+i); 
		 }
		}
	}
}