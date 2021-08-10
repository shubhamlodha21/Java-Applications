////////////////////////////////////////////////////
// Function name :--
// Description:Print the Pattern
// Input:5
// Output: 5 # 4 # 3 # 2 # 1
// Author:Shubham Lodha
// Date:10/08/2021
///////////////////////////////////////////////////


/*Accept number from user and display below pattern. 
Input : 5 
Output :  */

import java.util.*;

class LB102
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=iNo;i>0;i--)
		{
			System.out.printf("%d\t#\t",i);
		}
		
	}
}