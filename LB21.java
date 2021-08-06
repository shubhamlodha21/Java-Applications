/////////////////////////////////////////////////////////
//Function Name:LB21
//Input:5  
//Output: *	*	*	*	*
//Description:Print the Pattern
//Date: 06/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB21
{ 
public static void main(String[] args) 
  {
	int iNo=0;

	Scanner sobj= new Scanner(System.in);

	System.out.println("Enter Number");
	iNo=sobj.nextInt();

	int Arr[]=new int[iNo];

	for(int i=0;i<Arr.length;i++)
	{
		System.out.println("*");
	}
  }
}

