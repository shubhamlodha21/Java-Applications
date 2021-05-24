////////////////////////////////////////////////////////
//Function Name:pattern2
//Input:5
//Output:
       /*  $$$$$
           $$$$
           $$$
           $$
           $
              */ 
//Description: Print the pattern
//Date: 24/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;
class Pattern2
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		int iNo=0;

		System.out.print("Enter a Rows");
		iNo=sobj.nextInt();

      for(int i=1;i<=iNo;i++)
      {
      	for(int j=1;j<=iNo;j++)
      	{
                  if(j>=i)
      		System.out.print("$");
      	}
      	System.out.print("\n");
      }

	}
}