  
////////////////////////////////////////////////////
// Function name :--
// Description:Print the Pattern
// Input:5
// Output: A B C D E
// Author:Shubham Lodha
// Date:10/08/2021
///////////////////////////////////////////////////

import java.util.*;

class LB101
{
	public static void main(String[] args) 
	{
		int iNo;
		char ch='A';

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=ch;i<=ch+iNo;i++)
		{
			System.out.printf("%c\t",i);
		}
		
	}
}