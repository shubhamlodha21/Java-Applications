
////////////////////////////////////////////////////////
//Function Name:LB13
//Input:5
//Output: 5  4  3  2  1
//Description:Accept Number from user and display in Decending order
//Date: 19/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB13
{
	public static void main(String[] args) 
    {
	   int iNo1=0;

	   Scanner sobj=new Scanner(System.in);

	   System.out.print("Enter  Number:");
	   iNo1=sobj.nextInt();

	   int Arr[]=new int[iNo1];

       for(int i=Arr.length;i>0;i--)
       {
       	System.out.printf("%d\n",i);
       }
        	
	 }
}