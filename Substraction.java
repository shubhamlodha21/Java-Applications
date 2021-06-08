////////////////////////////////////////////////////////
//Function Name:Substraction
//Input:10 20 
//Output:-10
//Description:Accept Two Numbers from user and return Substraction of Two Numbers 
//Date: 09/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class Substraction 
{
	public static void main(String arg[])
	{
		int no1,no2,ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		ans = no1 - no2;
		
		System.out.println("Substraction is : "+ans);
	}
}