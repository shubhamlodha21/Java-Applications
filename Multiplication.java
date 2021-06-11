////////////////////////////////////////////////////////
//Function Name:Multiplication
//Input:5  9
//Output:45
//Description:Accept 2 Number From User And Return Multiplication of them
//Date: 11/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

class Multiplication
{
	public static void main(String arg[])
	{
		int no1,no2,ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		ans = no1 * no2;
		
		System.out.println("Multiplication is : "+ans);
	}
}