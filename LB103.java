  
////////////////////////////////////////////////////
// Function name :--
// Description:Print the Pattern
// Input:5
// Output: 1 * 2 * 3 * 4 * 5 *
// Author:Shubham Lodha
// Date:10/08/2021
///////////////////////////////////////////////////

import java.util.*;

class LB103
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=1;i<=iNo;i++)
		{
			System.out.printf("%d\t*\t",i);
		}
		
	}
}