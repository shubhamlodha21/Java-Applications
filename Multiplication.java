////////////////////////////////////////////////////////
//Function Name:Multiplication
//Input:10 20 
//Output:200
//Description:Accept Two Numbers from user and return Multiplication of Two Numbers 
//Date: 09/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

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