  
////////////////////////////////////////////////////
// Function name :--
// Description:Print the Pattern
// Input:8
// Output: 2 4 6 8 10 12 14 16
// Author:Shubham Lodha
// Date:10/08/2021
///////////////////////////////////////////////////

import java.util.*;

class LB105
{
	public static void main(String[] args) 
	{
		int iNo;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Number:");
		iNo=sobj.nextInt();

		for(int i=2;i<=iNo*2;i=i+2)
		{
			System.out.printf("%d\t",i);
		}
		
	}
}