 
////////////////////////////////////////////////////////
//Function Name:LB15
//Input:5
//Output:* * * * *
//Description:Accept Number from user and print * times
//Date: 19/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB15
{
	public static void main(String[] args)
    {
	   int iNo1=0;

	   Scanner sobj=new Scanner(System.in);

	   System.out.println("Enter  Number");
	   iNo1=sobj.nextInt();

	   int Arr[]=new int[iNo1];

       for(int i=0;i<Arr.length;i++)
       {
       	 System.out.print("*\t");
       }
	  
	}
}